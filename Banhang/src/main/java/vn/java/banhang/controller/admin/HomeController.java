package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.SanPham;
import vn.java.banhang.service.SanPhamService;


@Controller
public class HomeController {
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/home")
	public ModelAndView getListHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		modelAndView.addObject("listSanPham", listSanPham);
		return modelAndView;
			
	}
}
