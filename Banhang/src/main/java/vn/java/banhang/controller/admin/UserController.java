package vn.java.banhang.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.service.TaiKhoanService;

@Controller
public class UserController {
	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping("/user")
	public ModelAndView getListUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		List<TaiKhoan> listuser = taiKhoanService.getListUser();
		modelAndView.addObject("listUser", listuser);
		return modelAndView;
			
	}
	@PostMapping("create/user")
	public ModelAndView createTaiKhoan(@RequestBody TaiKhoan tk) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		taiKhoanService.dangKy(tk);
		List<TaiKhoan> listuser = taiKhoanService.getListUser();
		modelAndView.addObject("listUser", listuser);
		return modelAndView;
	}
	//update
	@PutMapping("update/user/{id}")
	public ModelAndView updateTaiKoan(@RequestBody TaiKhoan tk, @PathVariable (value = "id") Long userId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		TaiKhoan user = taiKhoanService.updateTaiKhoan(userId, tk);
		modelAndView.addObject(user);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/user/{id}")
	public ModelAndView getDetailTaiKhoan(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		Optional<TaiKhoan> taiKhoan = taiKhoanService.findTaiKhoanId(id);
		modelAndView.addObject(taiKhoan);
		return modelAndView;
			
	}
	@DeleteMapping("/user/{id}")
	public ModelAndView deleteTaiKhoan(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		Optional<TaiKhoan> taiKhoan = taiKhoanService.findTaiKhoanId(id);
		modelAndView.addObject(taiKhoan);
		return modelAndView;
	}
	
//	@RequestMapping("/")
//	public String taikhoan(Map<>)

}
