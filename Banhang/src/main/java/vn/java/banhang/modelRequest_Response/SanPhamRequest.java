package vn.java.banhang.modelRequest_Response;

import org.springframework.web.multipart.MultipartFile;

public class SanPhamRequest {

	private String tenSanPham;
	private Float giam;
	private Float giaBan;
	private Long nhaCungCap;
	private Long loai;
	private MultipartFile hinhAnh;
	private String moTa;
	private Integer soLuongNhap;
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public Float getGiam() {
		return giam;
	}
	public void setGiam(Float giam) {
		this.giam = giam;
	}
	public Float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(Float giaBan) {
		this.giaBan = giaBan;
	}
	
	public Long getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(Long nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public Long getLoai() {
		return loai;
	}
	public void setLoai(Long loai) {
		this.loai = loai;
	}
	public MultipartFile getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(MultipartFile hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Integer getSoLuongNhap() {
		return soLuongNhap;
	}
	public void setSoLuongNhap(Integer soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}
}
