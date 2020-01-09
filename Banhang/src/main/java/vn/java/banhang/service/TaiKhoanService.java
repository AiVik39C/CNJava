package vn.java.banhang.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.modelRequest_Response.DangKyRequest;
import vn.java.banhang.modelRequest_Response.DangNhapRequest;
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
	
	public TaiKhoan get(long id) {
		return taiKhoanRepository.findById(id).get();
	}
	
	public List<TaiKhoan> getListUserByQuyen(Quyen quyen) {
		return taiKhoanRepository.getListByQuyen(quyen);
	}
	public Optional<TaiKhoan> loginUser(DangNhapRequest request) {
		return taiKhoanRepository.findTaiKhoanByTenTaiKhoanAndMatKhau(request.getTenTaiKhoan(), request.getMatKhau());
	}
	
	public boolean validateTaiKhoan(String userName, Quyen quyen) {
		return taiKhoanRepository.existsByTenTaiKhoanAndQuyen(userName, quyen);
	}
	public List<String> validateLogin(DangNhapRequest request) {
		List<String> listError = new ArrayList<String>();
		
		if (request.getTenTaiKhoan() == null) {
			listError.add("Tên tài khoản bắt buộc nhập!");
		}
		if (request.getMatKhau() == null) {
			listError.add("Mật khẩu bắt buộc nhập!");
		}
		return listError;
	}
	
	public List<String> validateRegister(DangKyRequest request) {
		List<String> listError = new ArrayList<String>();
		
		if (request.getTenTaiKhoan() == null) {
			listError.add("Tên tài khoản bắt buộc nhập!");
		} else if (taiKhoanRepository.existsByTenTaiKhoan(request.getTenTaiKhoan()) ) {
			listError.add("Tên tài khoản đã tồn tại!");
		}
		if (request.getMatKhau() == null) {
			listError.add("Mật khẩu bắt buộc nhập!");
		}
		if (request.getEmail() == null) {
			listError.add("Email bắt buộc nhập!");
		} else if (taiKhoanRepository.existsByEmail(request.getEmail())) {
			listError.add("Email đã tồn tại!");
		}
		if (request.getSoDienThoai() == null) {
			listError.add("Số điện thoại bắt buộc nhập!");
		} else if (taiKhoanRepository.existsBySoDienThoai(request.getSoDienThoai())) {
			listError.add("Số điện thoại đã tồn tại!");
		}
		return listError;
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
	
	public void delete(long id){
		taiKhoanRepository.deleteById(id);
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
