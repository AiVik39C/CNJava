package vn.java.banhang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.SanPham;

public interface DonHangRepository extends JpaRepository<DonHang, Long>{
	Optional<DonHang> findDonHangById_DonHang(Long id);
}
