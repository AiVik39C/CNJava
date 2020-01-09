package vn.java.banhang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.SanPham;
import vn.java.banhang.repository.SanPhamRepository;

@Service
public class SanPhamService {
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	public List<SanPham> getListSanPham() {
		List<SanPham> list = sanPhamRepository.findAll();
		return list;
	}
	
	public SanPham findSanPhamId(Long id) {
		return sanPhamRepository.findById(id).orElse(null);
	}
	
	public SanPham saveSanPham(SanPham request) {
		return saveSanPham(request);
		
	}
	
	public SanPham createSanPham(SanPham sanPhamRequest) {
		SanPham createSanPham = saveSanPham(sanPhamRequest);
		return createSanPham;
	}
	
	public SanPham save(SanPham sanPham) {
		return sanPhamRepository.save(sanPham);
	}
	
	public void deleteSanPham(SanPham sanPham) {
		sanPhamRepository.delete(sanPham);
	}
	
	public SanPham updateSanPham(Long id, SanPham sanPhamRequest) {
		SanPham sanPham = sanPhamRepository.findById(id).orElse(null);
		if (sanPham != null) {
			sanPham.setTenSanPham(sanPham.getTenSanPham());
			sanPham.setGiam(sanPham.getGiam());
			sanPham.setGiaBan(sanPham.getGiaBan());
			sanPham.setNhaCungCap(sanPham.getNhaCungCap());
			sanPham.setLoai(sanPham.getLoai());
			sanPham.setHinhAnh(sanPham.getHinhAnh());
			sanPham.setMoTa(sanPham.getMoTa());
			sanPham.setSoLuongNhap(sanPham.getSoLuongNhap());
			final SanPham updateSanPham = save(sanPham);
			return updateSanPham;			
		}
		return null;
	}
}
