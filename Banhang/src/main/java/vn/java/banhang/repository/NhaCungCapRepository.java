package vn.java.banhang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.java.banhang.model.NhaCungCap;
import vn.java.banhang.model.TaiKhoan;

public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, Long> {
	Optional<NhaCungCap> findNCCById_NCC(Long id);
}
