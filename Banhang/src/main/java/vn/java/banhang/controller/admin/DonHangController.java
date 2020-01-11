package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.SanPham;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.modelRequest_Response.AddOrderRequest;
import vn.java.banhang.modelRequest_Response.ThanhToanRequest;
import vn.java.banhang.service.DonHangService;
import vn.java.banhang.service.SanPhamService;
import vn.java.banhang.service.TaiKhoanService;
import vn.java.banhang.util.Constant;

@Controller
public class DonHangController {
	@Autowired
	private DonHangService donHangService;
	
	@Autowired
	private TaiKhoanService taiKhoanService;
	
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/donhang")
	public ModelAndView getListDonHang() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		List<DonHang> listDonHang = donHangService.getListDonHang();
		modelAndView.addObject("listDonHang", listDonHang);
		return modelAndView;		
	}
	@GetMapping("/thanhtoan")
	public ModelAndView getListThanhToan() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("thanh_toan");
		List<DonHang> listDonHang = donHangService.getListDonHang();
		modelAndView.addObject("listDonHang", listDonHang);
		return modelAndView;		
	}
		
	//Hien thi chi tiet
	@GetMapping("/donhang/{id}")
	public ModelAndView getDetailDonHang(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		DonHang donHang = donHangService.findDonHangId(id).orElse(null);
		if (donHang == null) {
			String error = "Id đơn hàng không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		modelAndView.addObject(donHang);
		return modelAndView;
			
	}
	
	@PostMapping("/addOrder")
	public ModelAndView addOrder(@ModelAttribute AddOrderRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("gio_hang");
//		TaiKhoan taiKhoan = taiKhoanService.findByIdAndQuyen(, Quyen.KHACH_HANG);
		SanPham sanPham = sanPhamService.findSanPhamId(request.getSanPhamId());
		if (Constant.taiKhoan == null) {
			String error = "userId không chính xác!";
			modelAndView.addObject("error",error);
			return modelAndView;
		}
		if (sanPham == null) {
			String error = "Id sản phẩm không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		if (sanPham.getSoLuongNhap() > 0) {
			DonHang donHang = donHangService.addCart(Constant.taiKhoan, sanPham, 1);
//			modelAndView.addObject(donHang);
		} else {
			modelAndView.addObject("message", "Sản phẩm này đang hết hàng!");
		}
		
		return new ModelAndView("redirect:/giohang");
	}
	
	@PostMapping("/thanhtoan")
	public ModelAndView thanhToan(@RequestBody ThanhToanRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("gio_hang");
		DonHang donHang = donHangService.findDonHangId(request.getDonHangId()).orElse(null);
		if (donHang == null) {
			String error = "Id đơn hàng không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		donHangService.thanhToan(donHang);
		return modelAndView;
	}
}
