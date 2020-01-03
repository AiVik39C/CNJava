package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.service.DonHangService;

@Controller
public class GioHangController {
	@Autowired
	private DonHangService donHangService;

	@GetMapping("/giohang")
	public ModelAndView getListDonHang() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("gio_hang");
		List<DonHang> listDonHang = donHangService.getListDonHang();
		modelAndView.addObject("listDonHang", listDonHang);
		return modelAndView;
			
	}
		
}
