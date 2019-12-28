package vn.java.banhang.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TaiKhoan")

public class TaiKhoan implements Serializable  {
	private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_TaiKhoan;
	private String tenTaiKhoan;
	private String matKhau;
	private String hoTen;
	private Boolean gioitinh;
	private String soDienThoai;
	private String email;
	@Enumerated(EnumType.STRING)
	private Quyen quyen;
	@OneToMany(mappedBy = "taiKhoan")
	private List<DonHang> listDonHang;
	public TaiKhoan(Long id_TaiKhoan, String tenTaiKhoan, String matKhau, String hoTen, Boolean gioitinh,
			String soDienThoai, String email, Quyen quyen) {
		super();
		this.id_TaiKhoan = id_TaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.gioitinh = gioitinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.quyen = quyen;
	}
	
	public TaiKhoan() {}
	public TaiKhoan(String tenTaiKhoan, String matKhau, String hoTen, Boolean gioitinh, String soDienThoai,
			String email, Quyen quyen) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.gioitinh = gioitinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.quyen = quyen;
	}
	public Long getId_TaiKhoan() {
		return id_TaiKhoan;
	}
	public void setId_TaiKhoan(Long id_TaiKhoan) {
		this.id_TaiKhoan = id_TaiKhoan;
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
	public Quyen getQuyen() {
		return quyen;
	}
	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}