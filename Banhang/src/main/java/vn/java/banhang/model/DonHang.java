package vn.java.banhang.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToMany(fetch = FetchType.LAZY)
   	@JoinTable(name = "DonHang_SanPham",
            joinColumns = @JoinColumn(name = "donHang_id"),
            inverseJoinColumns = @JoinColumn(name = "sanPham_id"))
	private List<SanPham> listSanPham;
	
	private Integer tongSoLuong;
	private Float tongTien;
	@CreatedDate
	private Instant ngayMua;
	private String tinhTrangDH;
	public DonHang(Long id_DonHang, TaiKhoan taiKhoan, List<SanPham> listSanPham, Integer tongSoLuong, Float tongTien,
			Instant ngayMua, String tinhTrangDH) {
		super();
		this.id_DonHang = id_DonHang;
		this.taiKhoan = taiKhoan;
		this.listSanPham = listSanPham;
		this.tongSoLuong = tongSoLuong;
		this.tongTien = tongTien;
		this.ngayMua = ngayMua;
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
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
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
	public String getTinhTrangDH() {
		return tinhTrangDH;
	}
	public void setTinhTrangDH(String tinhTrangDH) {
		this.tinhTrangDH = tinhTrangDH;
	}
}
