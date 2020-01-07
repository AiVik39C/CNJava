package vn.java.banhang.controller.admin;

import java.util.List;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.modelRequest_Response.DangNhapRequest;
import vn.java.banhang.service.TaiKhoanService;

@Controller
public class DangKyController {
	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping("/dangky")
	public ModelAndView getListDonHang() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dang_ky");
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		modelAndView.addObject("listTaiKhoan", listTaiKhoan);
		return modelAndView;
			
	}
	
	@PostMapping("/errordangky")
	public Object  postDangKy(@ModelAttribute("taikhoan") TaiKhoan taikhoan) {
		ModelAndView modelAndView = new ModelAndView();
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		if(listTaiKhoan.size() > 0) {
			for(TaiKhoan tk : listTaiKhoan)
			{
				if(taikhoan.getTenTaiKhoan().equalsIgnoreCase(tk.getTenTaiKhoan())) {
					modelAndView.setViewName("box_messager");
					String messager = "Tài khoản đã tồn tại vui lòng đăng ký với tên tài khoản khác...";
					modelAndView.addObject("messager",messager);
			        return modelAndView;
				}
			}
			taiKhoanService.save(taikhoan); 
			return "redirect:dangnhap";
		}else {
			taiKhoanService.save(taikhoan);
		}
        return modelAndView;
	}
	
	private boolean validateInfoAccount(TaiKhoan tk) {
		if(tk.getTenTaiKhoan() == null || tk.getTenTaiKhoan().equals("")) {
			return false;
		}
		if(tk.getMatKhau() == null || tk.getMatKhau().equals("")) {
			return false;
		}
		if(tk.getHoTen() == null || tk.getHoTen().equals("")) {
			return false;
		}
		if(tk.getSoDienThoai() == null || tk.getSoDienThoai().equals("")) {
			return false;
		}
		if(tk.getEmail() == null || tk.getEmail().equals("")) {
			return false;
		}
		return true;
	}
}
