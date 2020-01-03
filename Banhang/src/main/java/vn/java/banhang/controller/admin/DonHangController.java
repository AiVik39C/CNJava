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

import vn.java.banhang.model.DonHang;
import vn.java.banhang.service.DonHangService;

@Controller
public class DonHangController {
	@Autowired
	private DonHangService donHangService;

	@GetMapping("/donhang")
	public ModelAndView getListDonHang() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		List<DonHang> listDonHang = donHangService.getListDonHang();
		modelAndView.addObject("listDonHang", listDonHang);
		return modelAndView;
			
	}
		
	
	@PostMapping("create/donhang")
	public ModelAndView createDonHang(@RequestBody DonHang donHang) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		List<DonHang> listDonHang = donHangService.getListDonHang();
		modelAndView.addObject("listDonHang", listDonHang);
		return modelAndView;
	}
	//update
	@PutMapping("update/donhang/{id}")
	public ModelAndView updateDonHang(@RequestBody DonHang dh, @PathVariable (value = "id") Long dhId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		DonHang donHang = donHangService.updateDonHang(dhId, dh);
		modelAndView.addObject(donHang);
		return modelAndView;
	}
	//Hien thi chi tiet
	@GetMapping("/donhang/{id}")
	public ModelAndView getDetailDonHang(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		Optional<DonHang> donHang = donHangService.findDonHangId(id);
		modelAndView.addObject(donHang);
		return modelAndView;
			
	}
	@DeleteMapping("/donhang/{id}")
	public ModelAndView deleteNCC(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		Optional<DonHang> donHang = donHangService.findDonHangId(id);
		modelAndView.addObject(donHang);
		return modelAndView;
	}
}
