package vn.java.banhang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.NhaCungCap;
import vn.java.banhang.repository.DonHangRepository;
import vn.java.banhang.repository.NhaCungCapRepository;

@Service
public class DonHangService {
	@Autowired
	private DonHangService donHangService;
	
	@Autowired
	private DonHangRepository donHangRepository;
	
	public List<DonHang> getListDonHang() {
		return donHangRepository.findAll();
	}
	
	public Optional<DonHang> findDonHangId(Long id) {
		return donHangRepository.findDonHangById_DonHang(id);
	}
	
	public DonHang saveDonHang(DonHang request) {
		return donHangRepository.save(request);
		
	}
	
	public DonHang createDonHang(DonHang donHangRequest) {
		DonHang createDonhang = saveDonHang(donHangRequest);
		return createDonhang;
	}
	
	public DonHang save(DonHang donHang) {
		return donHangRepository.save(donHang);
	}
	
	public void deleteDonHang(DonHang donHang) {
		donHangRepository.delete(donHang);
	}
	
	public DonHang updateDonHang(Long id, DonHang donHangRequest) {
		DonHang donHang = donHangRepository.findById(id).orElse(null);
		if (donHang != null) {
			donHang.setTaiKhoan(donHang.getTaiKhoan());
			donHang.setTongSoLuong(donHang.getTongSoLuong());
			donHang.setTongTien(donHang.getTongTien());
			donHang.setTinhTrangDH(donHang.getTinhTrangDH());
			donHang.setNgayMua(donHang.getNgayMua());
			final DonHang updateDonHang = save(donHang);
			return updateDonHang;			
		}
		return null;
	}
}
