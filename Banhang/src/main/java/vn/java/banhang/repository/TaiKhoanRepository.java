package vn.java.banhang.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.java.banhang.model.Quyen;
import vn.java.banhang.model.TaiKhoan;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
	
	List<TaiKhoan> getListByQuyen(Quyen quyen);
	Optional<TaiKhoan> findTaiKhoanByTenTaiKhoanAndQuyen(String username, Quyen quyen);
	Optional<TaiKhoan> findTaiKhoanByTenTaiKhoanAndQuyenAndMatKhau(String username, Quyen quyen, String password);
	boolean existsByTenTaiKhoanAndQuyen(String username, Quyen quyen);
	boolean existsByTenTaiKhoan(String userName);
	boolean existsByEmail(String email);
	boolean existsBySoDienThoai(String soDienThoai);

}
