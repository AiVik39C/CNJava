package vn.java.banhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.modelRequest_Response.DangKyRequest;
import vn.java.banhang.modelRequest_Response.DangNhapRequest;
import vn.java.banhang.service.TaiKhoanService;
import vn.java.banhang.util.Constraint;

@Controller
public class AuthController {
	
	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping("/dangky")
	public String indexDangKy() {
		return "dang_ky";
	}
	
	@PostMapping("/dangky")
	public ModelAndView dangKy(@ModelAttribute("taikhoan") DangKyRequest request) {
		ModelAndView modelAndView = new ModelAndView("dang_ky");
		modelAndView.setViewName("dang_ky");
		List<String> listError = taiKhoanService.validateRegister(request);
		if (listError.size() != 0) {
//			response.setListError(listError);
			modelAndView.addObject("errors", listError);
			return modelAndView;
		}
		TaiKhoan taiKhoan = taiKhoanService.save(new TaiKhoan(request.getTenTaiKhoan(), request.getMatKhau(), request.getHoTen(), request.getGioitinh(), request.getSoDienThoai(), request.getEmail(), Quyen.KHACH_HANG));
		return new ModelAndView("redirect:/dang_nhap");
	}
	
	@GetMapping("/dangnhap")
	public String indexDangNhap() {
		return "dang_nhap";
	}
	
	@PostMapping("/dangnhap")
	public RedirectView dangNhap(@ModelAttribute("login") DangNhapRequest request, RedirectAttributes redirectAttributes) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("dang_nhap");
//		BaseResponse response = new BaseResponse();
		List<String> listError = taiKhoanService.validateLogin(request);
		if (listError.size() != 0) {
//			response.setListError(listError);
			RedirectView redirectView = new RedirectView("dang_nhap");
			redirectView.addStaticAttribute("errors", listError);
			return redirectView;
		}
		TaiKhoan taiKhoan = taiKhoanService.loginUser(request).orElse(null);
		if (taiKhoan == null) {
			listError.add("Vui lòng nhập lại tên tài khoản và mật khẩu!");
			redirectAttributes.addAttribute("errors", listError);
			RedirectView redirectView = new RedirectView("dang_nhap");
//			("errors", listError);
			return redirectView;
		}
//		response.setListError(listError);
//		response.setData(taiKhoan);
//		modelAndView.addObject(response);
		redirectAttributes.addFlashAttribute("user", taiKhoan);
		Constraint.taiKhoan = taiKhoan;
		if (taiKhoan.getQuyen() == Quyen.ADMIN) {
//			redirectAttributes.addAttribute("user", taiKhoan);
			RedirectView redirectView = new RedirectView("/home", true);
//			modelAndView.addObject("user", taiKhoan);
//			redirectView.addStaticAttribute("user", taiKhoan);
			return redirectView;
		}
		RedirectView redirectView = new RedirectView("/index");
//		modelAndView.addObject("user", taiKhoan);
		redirectView.addStaticAttribute("user", taiKhoan);
		return redirectView;
	}
}
