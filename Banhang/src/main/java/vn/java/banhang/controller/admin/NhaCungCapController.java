package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.NhaCungCap;
import vn.java.banhang.service.NhaCungCapService;
@Controller
public class NhaCungCapController {
	@Autowired
	private NhaCungCapService nhaCungCapService;

	@GetMapping("/nhacungcap")
	public ModelAndView getListNCC() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_nha_cung_cap");
		List<NhaCungCap> listNCC = nhaCungCapService.getListNCC();
		modelAndView.addObject("listNCC", listNCC);
		return modelAndView;
			
	}
	
	@PostMapping("create/nhacungcap")
	public ModelAndView createNCC(@RequestBody NhaCungCap ncc) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_nha_cung_cap");
		NhaCungCap nhaCungCap = nhaCungCapService.createNCC(ncc);
		modelAndView.addObject("nhaCungCap", nhaCungCap);
		return modelAndView;
	}
	//update
	@PutMapping("update/nhacungcap/{id}")
	public ModelAndView updateNCC(@RequestBody NhaCungCap ncc, @PathVariable (value = "id") Long nccId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_nha_cung_cap");
		NhaCungCap nhaCungCap = nhaCungCapService.updateNCC(nccId, ncc);
		modelAndView.addObject(nhaCungCap);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/nhacungcap/{id}")
	public ModelAndView getDetailNCC(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_nha_cung_cap");
		NhaCungCap nhaCungCap = nhaCungCapService.findNCCId(id).orElse(null);
		if (nhaCungCap == null) {
			String error = "Id nhà cung cấp không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		modelAndView.addObject(nhaCungCap);
		return modelAndView;
			
	}
	@DeleteMapping("/nhacungcap/{id}")
	public ModelAndView deleteNCC(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_nha_cung_cap");
		NhaCungCap nhaCungCap = nhaCungCapService.findNCCId(id).orElse(null);
		if (nhaCungCap == null) {
			String error = "Id nhà cung cấp không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		nhaCungCapService.deleteNCC(nhaCungCap);
		modelAndView.addObject("Xoá nhà cung cấp thành công!");
		modelAndView.addObject(nhaCungCap);
		return modelAndView;
	}
}
