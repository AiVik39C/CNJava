package vn.java.banhang.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.service.TaiKhoanService;



@Controller
public class UserController {
	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping("/user")
	public ModelAndView getListTaiKhoan() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		modelAndView.addObject("listTaiKhoan", listTaiKhoan);
		return modelAndView;
			
	}
	
	@PostMapping("create/user")
	public ModelAndView createTaiKhoan(@RequestBody TaiKhoan tk) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		List<TaiKhoan> listTaiKhoan = taiKhoanService.getListUser();
		modelAndView.addObject("listTaiKhoan", listTaiKhoan);
		return modelAndView;
	}
	//update
	@PutMapping("update/user/{id}")
	public ModelAndView updateTaiKhoan(@RequestBody TaiKhoan tk, @PathVariable (value = "id") Long tkId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		TaiKhoan taiKhoan = taiKhoanService.updateTaiKhoan(tkId, tk);
		modelAndView.addObject(taiKhoan);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/user/{id}")
	public ModelAndView getDetailTaiKhoan(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_user");
		Optional<TaiKhoan> taiKhoan = taiKhoanService.findTaiKhoanId(id);
		modelAndView.addObject("taiKhoan",taiKhoan);
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
}
