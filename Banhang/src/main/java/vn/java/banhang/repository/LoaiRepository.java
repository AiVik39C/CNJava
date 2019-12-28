package vn.java.banhang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.java.banhang.model.Loai;

public interface LoaiRepository extends JpaRepository<Loai, Long>{
	boolean existsByTenLoaiAndMoTa(String tenLoai, String moTa);
	boolean existsByIdNotAndTenLoai(Long id, String name);
}
