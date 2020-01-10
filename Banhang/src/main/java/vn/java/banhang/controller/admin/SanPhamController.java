package vn.java.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.java.banhang.model.Loai;
import vn.java.banhang.model.NhaCungCap;
import vn.java.banhang.model.SanPham;
import vn.java.banhang.modelRequest_Response.SanPhamRequest;
import vn.java.banhang.service.LoaiService;
import vn.java.banhang.service.NhaCungCapService;
import vn.java.banhang.service.SanPhamService;
import vn.java.banhang.util.FileHelper;
@Controller
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private NhaCungCapService nhaCungCapService;
	
	@Autowired
	private LoaiService loaiService;
	
	@Autowired
	private ServletContext context;

	@GetMapping("/sanpham")
	public ModelAndView getListSanPham() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		List<SanPham> listSanpham = sanPhamService.getListSanPham();
		List<NhaCungCap> listNhaCungCap = nhaCungCapService.getListNCC();
		modelAndView.addObject("listNhaCungCap", listNhaCungCap);
		List<Loai> listLoai = loaiService.getListLoai();
		modelAndView.addObject("listLoai", listLoai);
		modelAndView.addObject("listSanpham", listSanpham);
		return modelAndView;
			
	}
	
	@PostMapping("create/sanpham")
	public ModelAndView createSanPham(@ModelAttribute SanPhamRequest sp) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("quan_ly_san_pham");
		String hinhAnh = "";
		try {
			hinhAnh = new FileHelper().saveFile(sp.getHinhAnh(), context);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SanPham sanPham = new SanPham(sp.getTenSanPham(), sp.getGiam(), sp.getGiaBan(), nhaCungCapService.findNCCId(sp.getNhaCungCap()).orElse(null), loaiService.findLoaiById(sp.getLoai()).orElse(null), hinhAnh, sp.getMoTa(), sp.getSoLuongNhap());
		sanPhamService.save(sanPham);
//		SanPham sanPham = sanPhamService.createSanPham(sp);
		return new ModelAndView("redirect:/sanpham");
	}
	//update
	@PutMapping("update/sanpham/{id}")
	public ModelAndView updateSanPham(@ModelAttribute SanPham sp, @PathVariable (value = "id") Long spId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		SanPham sanPham = sanPhamService.updateSanPham(spId, sp);
		return new ModelAndView("redirect:/sanpham");
	}
	//Hien thi chi tiet
	@GetMapping("/sanpham/{id}")
	public ModelAndView getDetailSanpham(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		SanPham sanPham = sanPhamService.findSanPhamId(id);
		modelAndView.addObject(sanPham);
		return modelAndView;
			
	}
	@DeleteMapping("/sanpham/{id}")
	public ModelAndView deleteSanPham(@PathVariable(value = "id") Long id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quan_ly_san_pham");
		SanPham sanPham = sanPhamService.findSanPhamId(id);
		sanPhamService.deleteSanPham(sanPham);	
		return new ModelAndView("redirect:/quan_ly_san_pham");
	}
}
