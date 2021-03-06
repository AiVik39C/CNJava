package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import vn.java.banhang.model.Loai;
import vn.java.banhang.model.NhaCungCap;
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
	public RedirectView createLoai(@ModelAttribute("loai") Loai request) {
		RedirectView redirectView = new RedirectView("/loai");
		Loai loai = loaiService.save(new Loai(request.getTenLoai(), request.getMoTa()));
		return redirectView;
	}
	
//	@PostMapping("create/loai")
//	public ModelAndView createLoai(@RequestBody Loai loai) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("quan_ly_loai_san_pham");
//		List<Loai> listLoai = loaiService.getListLoai();
//		modelAndView.addObject("listLoai", listLoai);
//		return modelAndView;
//	}
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
		Loai loai = loaiService.findLoaiById(id).orElse(null);
		if (loai == null) {
			String error = "Id loại không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		modelAndView.addObject(loai);
		return modelAndView;
			
	}
	@DeleteMapping("/loai/{id}")
	public ModelAndView deleteLoai(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_loai_san_pham");
		Loai loai = loaiService.findLoaiById(id).orElse(null);
		if (loai == null) {
			String error = "Id loại không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		loaiService.deleteLoai(loai);
		modelAndView.addObject("Xoá Loại sản phầm thành công!");
		return modelAndView;
	}
}
