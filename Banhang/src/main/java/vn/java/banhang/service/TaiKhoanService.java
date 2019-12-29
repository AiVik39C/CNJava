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
	
	public List<TaiKhoan> getListUser() {
		return taiKhoanRepository.findAll();
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
	
	public Optional<TaiKhoan> findTaiKhoanId(Long id) {
		return taiKhoanRepository.findById(id);
	}
	
	public TaiKhoan saveTaiKhoan(TaiKhoan request) {
		return taiKhoanRepository.save(request);
		
	}
	
	public TaiKhoan createTaiKhoan(TaiKhoan taiKhoanRequest) {
		TaiKhoan createTaiKhoan = saveTaiKhoan(taiKhoanRequest);
		return createTaiKhoan;
	}
	
	public TaiKhoan save(TaiKhoan taiKhoan) {
		return taiKhoanRepository.save(taiKhoan);
	}
	public void deleteTaiKhoan(TaiKhoan taiKhoan) {
		taiKhoanRepository.delete(taiKhoan);
	}
	
	public TaiKhoan updateTaiKhoan(Long id, TaiKhoan taiKhoanRequest) {
		TaiKhoan taiKhoan = taiKhoanRepository.findById(id).orElse(null);
		if (taiKhoan != null) {
			taiKhoan.setEmail(taiKhoan.getEmail());
			taiKhoan.setGioitinh(taiKhoan.getGioitinh());
			taiKhoan.setHoTen(taiKhoan.getHoTen());
			taiKhoan.setMatKhau(taiKhoan.getMatKhau());
			taiKhoan.setSoDienThoai(taiKhoan.getSoDienThoai());
			taiKhoan.setTenTaiKhoan(taiKhoan.getTenTaiKhoan());
			taiKhoan.setQuyen(taiKhoan.getQuyen());
			final TaiKhoan updateTaiKhoan = save(taiKhoan);
			return updateTaiKhoan;
			
		}
		return null;
	}
	
//	public Loai createTaiKhoan(Loai loaiRequest) {
//		Loai createLoai = saveLoai(loaiRequest);
//		return createLoai;
//	}
}
