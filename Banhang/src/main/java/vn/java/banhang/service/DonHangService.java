package vn.java.banhang.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.DonHangSanPham;
import vn.java.banhang.model.SanPham;
import vn.java.banhang.model.StatusDonHang;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.repository.DonHangRepository;

@Service
public class DonHangService {
	
	@Autowired
	private DonHangRepository donHangRepository;
	
	@Autowired
	private DonHangSanPhamService donHangSanPhamService;
	
	@Autowired
	private SanPhamService sanPhamService;
	
	public List<DonHang> getListDonHang() {
		return donHangRepository.findAll();
	}
	
	public Optional<DonHang> findDonHangId(Long id) {
		return donHangRepository.findById(id);
	}
	
	public DonHang saveDonHang(DonHang request) {
		return donHangRepository.save(request);
	}
	
	public DonHang createDonHang(DonHang donHangRequest) {
		DonHang createDonhang = saveDonHang(donHangRequest);
		return createDonhang;
	}
	
	public DonHang save(DonHang donHang) {
		return donHangRepository.save(donHang);
	}
	
	public void deleteDonHang(DonHang donHang) {
		donHangRepository.delete(donHang);
	}
	
	public DonHang updateDonHang(Long id, DonHang donHangRequest) {
		DonHang donHang = donHangRepository.findById(id).orElse(null);
		if (donHang != null) {
			donHang.setTaiKhoan(donHang.getTaiKhoan());
			donHang.setTongSoLuong(donHang.getTongSoLuong());
			donHang.setTongTien(donHang.getTongTien());
			donHang.setTinhTrangDH(donHang.getTinhTrangDH());
			donHang.setNgayMua(donHang.getNgayMua());
			final DonHang updateDonHang = save(donHang);
			return updateDonHang;			
		}
		return null;
	}
	
	public DonHang addCart(TaiKhoan taiKhoan, SanPham sanPham ) {
		DonHang donHang = this.findByTaiKhoanAndStatusDonHang(taiKhoan, StatusDonHang.MOI);
		if (donHang == null) {
			donHang = new DonHang();
			DonHangSanPham donHangSP = donHangSanPhamService.save(new DonHangSanPham(donHang, sanPham, 1));
			donHang.setTaiKhoan(taiKhoan);
			donHang.setTinhTrangDH(StatusDonHang.MOI);
			donHang.setTongSoLuong(1);
			donHang.setTongTien(sanPham.getGiaBan());
			List<DonHangSanPham> list = new ArrayList<DonHangSanPham>();
			list.add(donHangSP);
			donHang.setListDonHangSanPham(list);	
			donHangRepository.save(donHang);
		} else {
			donHang.setTongSoLuong(donHang.getTongSoLuong() + 1);
			donHang.setTongTien(donHang.getTongTien() + sanPham.getGiaBan());
			boolean check = false;
			List<DonHangSanPham> list = donHang.getListDonHangSanPham();
			for (DonHangSanPham item : list) {
				if (item.getSanPham().getId_SanPham().equals(sanPham.getId_SanPham())) {
					item.setSoLuong(item.getSoLuong() + 1);
					check = true;
					donHangSanPhamService.save(item);
					break;
				}
			}
			if (!check) {
				DonHangSanPham donHangSP = donHangSanPhamService.save(new DonHangSanPham(donHang, sanPham, 1));
				donHang.getListDonHangSanPham().add(donHangSP);
			}
			donHangRepository.save(donHang);
		}
		return donHang;
	}
	
	public DonHang findByTaiKhoanAndStatusDonHang(TaiKhoan taiKhoan, StatusDonHang status) {
		return donHangRepository.findByTaiKhoanAndTinhTrangDH(taiKhoan, status).orElse(null);
	}
	
	public void thanhToan(DonHang donHang) {
		donHang.setTinhTrangDH(StatusDonHang.THANH_TOAN);
		donHangRepository.save(donHang);
		
		List<DonHangSanPham> list = donHang.getListDonHangSanPham();
		for (DonHangSanPham item: list) {
			SanPham sanPham = item.getSanPham();
			sanPham.setSoLuongNhap(sanPham.getSoLuongNhap() - item.getSoLuong());
			sanPhamService.save(sanPham);
		}
	}
}
