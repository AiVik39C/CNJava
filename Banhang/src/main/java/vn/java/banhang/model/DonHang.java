package vn.java.banhang.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "DonHang")
public class DonHang implements Serializable{
	private static final long serialVersionUID = -297553281792804396L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_DonHang;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_TaiKhoan")
	private TaiKhoan taiKhoan;
	
	@OneToMany(mappedBy = "donHang")
	private List<DonHangSanPham> listDonHangSanPham;
	
	private Integer tongSoLuong;
	private Float tongTien;
	
	@CreatedDate
	private Instant ngayMua;
	
	@Enumerated(EnumType.STRING)
	private StatusDonHang tinhTrangDH;
	
	public DonHang() {}
	public DonHang(Long id_DonHang, TaiKhoan taiKhoan, List<DonHangSanPham> listDonHangSanPham, Integer tongSoLuong, Float tongTien,
			Instant ngayMua, StatusDonHang tinhTrangDH) {
		super();
		this.id_DonHang = id_DonHang;
		this.taiKhoan = taiKhoan;
		this.listDonHangSanPham = listDonHangSanPham;
		this.tongSoLuong = tongSoLuong;
		this.tongTien = tongTien;
		this.ngayMua = ngayMua;
		this.tinhTrangDH = tinhTrangDH;
	}
	
	public DonHang(TaiKhoan taiKhoan, Float tongTien, StatusDonHang tinhTrangDH) {
		super();
		this.taiKhoan = taiKhoan;
		this.tongTien = tongTien;
		this.tinhTrangDH = tinhTrangDH;
	}
	
	public Long getId_DonHang() {
		return id_DonHang;
	}
	public void setId_DonHnag(Long id_DonHang) {
		this.id_DonHang = id_DonHang;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public Integer getTongSoLuong() {
		return tongSoLuong;
	}
	public void setTongSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}
	public Float getTongTien() {
		return tongTien;
	}
	public void setTongTien(Float tongTien) {
		this.tongTien = tongTien;
	}
	public Instant getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(Instant ngayMua) {
		this.ngayMua = ngayMua;
	}
	public StatusDonHang getTinhTrangDH() {
		return tinhTrangDH;
	}
	public void setTinhTrangDH(StatusDonHang tinhTrangDH) {
		this.tinhTrangDH = tinhTrangDH;
	}
	public List<DonHangSanPham> getListDonHangSanPham() {
		return listDonHangSanPham;
	}
	public void setListDonHangSanPham(List<DonHangSanPham> listDonHangSanPham) {
		this.listDonHangSanPham = listDonHangSanPham;
	}
	
}
