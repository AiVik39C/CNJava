package vn.java.banhang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.java.banhang.model.SanPham;
@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
}
