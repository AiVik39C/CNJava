package vn.java.banhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.modelRequest_Response.BaseResponse;
import vn.java.banhang.modelRequest_Response.DangKyRequest;
import vn.java.banhang.modelRequest_Response.DangNhapRequest;
import vn.java.banhang.service.TaiKhoanService;

@Controller
public class AuthController {
	
	@Autowired
	private TaiKhoanService taiKhoanService;

	@PostMapping("/dangky")
	public ModelAndView dangKy(@RequestBody DangKyRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dang_ky");
		BaseResponse response = new BaseResponse();
		List<String> listError = taiKhoanService.validateRegister(request);
		if (listError.size() != 0) {
			response.setListError(listError);
			modelAndView.addObject("response", response);
			return modelAndView;
		}
		TaiKhoan taiKhoan = taiKhoanService.save(new TaiKhoan(request.getTenTaiKhoan(), request.getMatKhau(), request.getHoTen(), request.getGioitinh(), request.getSoDienThoai(), request.getEmail(), Quyen.KHACH_HANG));
		response.setListError(listError);
		response.setData(taiKhoan);
		modelAndView.addObject(response);
		return modelAndView;
	}
	
	@PostMapping("/dangnhap")
	public ModelAndView dangNhap(@RequestBody DangNhapRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dang_nhap");
		BaseResponse response = new BaseResponse();
		List<String> listError = taiKhoanService.validateLogin(request);
		if (listError.size() != 0) {
			response.setListError(listError);
			modelAndView.addObject("response", response);
			return modelAndView;
		}
		TaiKhoan taiKhoan = taiKhoanService.loginUser(request).orElse(null);
		if (taiKhoan == null) {
			listError.add("Vui lòng nhập lại tên tài khoản và mật khẩu!");
			response.setListError(listError);
			modelAndView.addObject("response", response);
			return modelAndView;
		}
		response.setListError(listError);
		response.setData(taiKhoan);
		modelAndView.addObject(response);
		return modelAndView;
	}
}
