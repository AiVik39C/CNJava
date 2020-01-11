package vn.java.banhang.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "don_hang_san_pham")
public class DonHangSanPham implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "don_hang_id")
	private DonHang donHang;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "san_pham_id")
	private SanPham sanPham;
	private int soLuong;
	
	public DonHangSanPham(Long id, DonHang donHang, SanPham sanPham, int soLuong) {
		super();
		this.id = id;
		this.donHang = donHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}
	
	public DonHangSanPham() {}
	
	public DonHangSanPham( DonHang donHang, SanPham sanPham, int soLuong) {
		super();
		this.donHang = donHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DonHang getDonHang() {
		return donHang;
	}
	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
