package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.service.TaiKhoanService;

@Controller
public class DanhNhapController {
	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping("/dangnhap")
	public ModelAndView getListDangNhap() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dang_nhap");
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		modelAndView.addObject("listTaiKhoan", listTaiKhoan);
		return modelAndView;
			
	}
	
	@GetMapping("/head")
	public ModelAndView getListHead() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("head");
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		modelAndView.addObject("listTaiKhoan", listTaiKhoan);
		return modelAndView;
			
	}
	
	
	@PostMapping("/dangnhap")
	public Object  postDangNhap(@ModelAttribute("taikhoan") TaiKhoan taikhoan) {
		ModelAndView modelAndView = new ModelAndView();
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		if(listTaiKhoan.size() > 0) {
			for(TaiKhoan tk : listTaiKhoan)
			{
				if(taikhoan.getTenTaiKhoan().equalsIgnoreCase(tk.getTenTaiKhoan())) {
					if(taikhoan.getMatKhau().equalsIgnoreCase(tk.getMatKhau())) {
						if(taikhoan.getQuyen().equals(Quyen.ADMIN)) {
						    return "redirect:index_admin";
						}else {
						    return "redirect:index";
						}
					}
				}
			}
			modelAndView.setViewName("box_messager");
			modelAndView.addObject("error_not_account", "Bạn chưa có tài khoản vui lòng đăng ký");
	        return modelAndView;
		}else {
			modelAndView.setViewName("box_messager");
			modelAndView.addObject("error_not_account", "Bạn chưa có tài khoản vui lòng đăng ký");
	        return modelAndView;
		}
	}
	
	private boolean validateInfoAccountDN(TaiKhoan tk) {
		if(tk.getTenTaiKhoan() == null || tk.getTenTaiKhoan().equals("")) {
			return false;
		}
		if(tk.getMatKhau() == null || tk.getMatKhau().equals("")) {
			return false;
		}
		return true;
	}
}
