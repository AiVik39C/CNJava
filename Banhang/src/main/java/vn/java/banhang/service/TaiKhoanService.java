package vn.java.banhang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.repository.TaiKhoanRepository;

@Service
public class TaiKhoanService {
	@Autowired
	private TaiKhoanRepository taiKhoanRepository;
	
	public Boolean dangKy(TaiKhoan request) {
		taiKhoanRepository.save(request);
		return true;
	}
	
	public List<TaiKhoan> getListUserByQuyen(Quyen quyen) {
		return taiKhoanRepository.getListByQuyen(quyen);
	}
	
	public boolean validateTaiKhoan(String userName, Quyen quyen) {
		return taiKhoanRepository.existsByTenTaiKhoanAndQuyen(userName, quyen);
	}
	
	public Optional<TaiKhoan> findTaiKhoan(String userName, Quyen quyen) {
		return taiKhoanRepository.findTaiKhoanByTenTaiKhoanAndQuyen(userName, quyen);
	}
	
}
