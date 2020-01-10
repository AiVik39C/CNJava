package vn.java.banhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.DonHangSanPham;
import vn.java.banhang.repository.DonhangSanPhamRepository;


@Service
public class DonHangSanPhamService {
	
	@Autowired
	private DonhangSanPhamRepository donhangSanPhamRepository;

	public DonHangSanPham save(DonHangSanPham donHangSP) {
		return donhangSanPhamRepository.save(donHangSP);
	}
	
}
