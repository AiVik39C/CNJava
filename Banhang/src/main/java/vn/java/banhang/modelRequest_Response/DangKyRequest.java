package vn.java.banhang.modelRequest_Response;

import vn.java.banhang.model.Quyen;

public class DangKyRequest {
	 private String tenTaiKhoan;
	 private String matKhau;
	 private String hoTen;
	 private Boolean gioitinh;
	 private String soDienThoai;
	 private String email;
//	 private Quyen quyen;
	public DangKyRequest(String tenTaiKhoan, String matKhau, String hoTen, Boolean gioitinh, String soDienThoai,
			String email) {
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.gioitinh = gioitinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}
	
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Boolean getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
