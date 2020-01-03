package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.SanPham;
import vn.java.banhang.service.SanPhamService;

@Controller
public class ChiTietSanPhamController {
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/chitietsp")
	public ModelAndView getListSanPham() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("chi_tiet_san_pham");
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		modelAndView.addObject("listSanpham", listSanPham);
		return modelAndView;
			
	}
}
