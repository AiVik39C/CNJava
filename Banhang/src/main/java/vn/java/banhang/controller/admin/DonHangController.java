package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ModelAndView addOrder(@RequestBody AddOrderRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
		TaiKhoan taiKhoan = taiKhoanService.findByIdAndQuyen(request.getUserId(), Quyen.KHACH_HANG);
		SanPham sanPham = sanPhamService.findSanPhamId(request.getSanPhamId());
		if (taiKhoan == null) {
			String error = "userId không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		if (sanPham == null) {
			String error = "Id sản phẩm không chính xác!";
			modelAndView.addObject(error);
			return modelAndView;
		}
		if (sanPham.getSoLuongNhap() > 0) {
			DonHang donHang = donHangService.addCart(taiKhoan, sanPham);
			modelAndView.addObject(donHang);
		} else {
			modelAndView.addObject("Sản phẩm này đang hết hàng!");
		}
		
		return modelAndView;
	}
	
	@PostMapping("/thanhtoan")
	public ModelAndView thanhToan(@RequestBody ThanhToanRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_don_hang");
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
