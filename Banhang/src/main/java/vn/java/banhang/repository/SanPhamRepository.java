package vn.java.banhang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import vn.java.banhang.model.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
	Optional<SanPham> findSanPhamById_SanPham(Long id);
}
