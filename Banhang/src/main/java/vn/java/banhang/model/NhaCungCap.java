package vn.java.banhang.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NhaCungCap")

public class NhaCungCap implements Serializable {
	private static final long serialVersionUID = -297553281792804396L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_NCC;
	private String tenNhaCungCap;
	private String diaChi;
	private String soDienThoai;
	
	@OneToMany(mappedBy = "nhaCungCap")
	private List<SanPham> listSanPham;

	public NhaCungCap(Long id_NCC, String tenNhaCungCap, String diaChi, String soDienThoai, List<SanPham> listSanPham) {
		super();
		this.id_NCC = id_NCC;
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.listSanPham = listSanPham;
	}

	public Long getId_NCC() {
		return id_NCC;
	}

	public void setId_NCC(Long id_NCC) {
		this.id_NCC = id_NCC;
	}

	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	public NhaCungCap(String tenNhaCungCap, String diaChi, String soDienThoai) {
		super();
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	
}
