package vn.java.banhang.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import vn.java.banhang.util.FileHelper;

@Entity
@Table(name = "SanPham")
public class SanPham implements Serializable {
	private static final long serialVersionUID = -297553281792804396L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_SanPham;
	@Column(columnDefinition = "nvarchar(max)")
	private String tenSanPham;
	private Float giam;
	private Float giaBan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_NCC")
	private NhaCungCap nhaCungCap;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_TaiKhoan")
	private Loai loai;
	private String hinhAnh;
	@Column(columnDefinition = "nvarchar(max)")
	private String moTa;
	private Integer soLuongNhap;
	
	@OneToMany(mappedBy = "sanPham")
	private List<DonHangSanPham> listDonHangSanPham;
	
	public SanPham() {}
	public SanPham(Long id_SanPham, String tenSanPham, Float giam, Float giaBan, NhaCungCap nhaCungCap, Loai loai,
			String hinhAnh, String moTa, Integer soLuongNhap) {
		super();
		
		this.id_SanPham = id_SanPham;
		this.tenSanPham = tenSanPham;
		this.giam = giam;
		this.giaBan = giaBan;
		this.nhaCungCap = nhaCungCap;
		this.loai = loai;
		this.hinhAnh = hinhAnh;
		this.moTa = moTa;
		this.soLuongNhap = soLuongNhap;
	}
	public SanPham( String tenSanPham, Float giam, Float giaBan, NhaCungCap nhaCungCap, Loai loai,
			String hinhAnh, String moTa, Integer soLuongNhap) {
		super();
		this.tenSanPham = tenSanPham;
		this.giam = giam;
		this.giaBan = giaBan;
		this.nhaCungCap = nhaCungCap;
		this.loai = loai;
		this.hinhAnh = hinhAnh;
//		try {
//			this.hinhAnh = new FileHelper().saveFile(hinhAnh);
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.moTa = moTa;
		this.soLuongNhap = soLuongNhap;
	}
	public Long getId_SanPham() {
		return id_SanPham;
	}

	public void setId_SanPham(Long id_SanPham) {
		this.id_SanPham = id_SanPham;
	}
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

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public Loai getLoai() {
		return loai;
	}
	public void setLoai(Loai loai) {
		this.loai = loai;

	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
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


