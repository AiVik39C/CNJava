package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
