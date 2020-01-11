package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.java.banhang.model.SanPham;
import vn.java.banhang.service.SanPhamService;
import vn.java.banhang.util.Constant;


@Controller
public class HomeController {
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/home")
	public ModelAndView getListHome(RedirectAttributes redirectAttrs) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		if (Constant.taiKhoan != null) {
			modelAndView.addObject("user", Constant.taiKhoan);
		}
		modelAndView.addObject("listSanPham", listSanPham);
		return modelAndView;
			
	}
	@GetMapping("/homeadmin")
	public ModelAndView getListHead() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index_admin");
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		modelAndView.addObject("listSanPham", listSanPham);
		return modelAndView;
			
	}
}

