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

import vn.java.banhang.exception.ResourceNotFoundException;
import vn.java.banhang.model.Loai;
import vn.java.banhang.service.LoaiService;
@Controller
public class LoaiController {

	@Autowired
	private LoaiService loaiService;

	@GetMapping("/loai")
	public ModelAndView getListLoai() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		List<Loai> listLoai = loaiService.getListLoai();
		modelAndView.addObject("listLoai", listLoai);
		return modelAndView;
			
	}
	
	@PostMapping("create/loai")
	public ModelAndView createLoai(@RequestBody Loai loai) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		List<Loai> listLoai = loaiService.getListLoai();
		modelAndView.addObject("listLoai", listLoai);
		return modelAndView;
	}
	//update
	@PutMapping("update/loai/{id}")
	public ModelAndView updateLoai(@RequestBody Loai loai, @PathVariable (value = "id") Long loaiId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		Loai Loai = loaiService.updateLoai(loaiId, loai);
		modelAndView.addObject(Loai);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/loai/{id}")
	public ModelAndView getDetailLoai(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		Optional<Loai> loai = loaiService.findLoaiById(id);
		modelAndView.addObject(loai);
		return modelAndView;
			
	}
	@DeleteMapping("/loai/{id}")
	public ModelAndView deleteLoai(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		Optional<Loai> loai = loaiService.findLoaiById(id);
		modelAndView.addObject(loai);
		return modelAndView;
	}
}