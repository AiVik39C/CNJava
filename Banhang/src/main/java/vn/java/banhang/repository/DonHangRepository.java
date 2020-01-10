package vn.java.banhang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.StatusDonHang;
import vn.java.banhang.model.TaiKhoan;

public interface DonHangRepository extends JpaRepository<DonHang, Long>{
	
	Optional<DonHang> findByTaiKhoanAndTinhTrangDH(TaiKhoan taiKhoan, StatusDonHang status);
}
