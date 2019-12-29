package vn.java.banhang.controller.admin;

import java.util.ArrayList;
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

import vn.java.banhang.model.SanPham;
import vn.java.banhang.service.SanPhamService;
@Controller
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/sanpham")
	public ModelAndView getListSanPham() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		List<SanPham> listSanpham = sanPhamService.getListSanPham();
		modelAndView.addObject("listSanpham", listSanpham);
		return modelAndView;
			
	}
	
	@PostMapping("create/sanpham")
	public ModelAndView createSanPham(@RequestBody SanPham ncc) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		modelAndView.addObject("listUser", listSanPham);
		return modelAndView;
	}
	//update
	@PutMapping("update/sanpham/{id}")
	public ModelAndView updateSanPham(@RequestBody SanPham sp, @PathVariable (value = "id") Long spId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		SanPham sanPham = sanPhamService.updateSanPham(spId, sp);
		modelAndView.addObject(sanPham);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/sanpham/{id}")
	public ModelAndView getDetailNCC(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		Optional<SanPham> sanPham = sanPhamService.findSanPhamId(id);
		modelAndView.addObject(sanPham);
		return modelAndView;
			
	}
	@DeleteMapping("/sanpham/{id}")
	public ModelAndView deleteNCC(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		Optional<SanPham> sanPham = sanPhamService.findSanPhamId(id);
		modelAndView.addObject(sanPham);
		return modelAndView;
	}
}
