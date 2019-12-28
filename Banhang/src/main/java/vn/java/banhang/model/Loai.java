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
@Table(name = "Loai")
public class Loai implements Serializable {
	private static final long serialVersionUID = -297553281792804396L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tenLoai;
	private String moTa;
	@OneToMany(mappedBy = "loai")
	private List<SanPham> listSanPham;
	public Loai(Long id, String tenLoai, String moTa) {
		super();
		this.id = id;
		this.tenLoai = tenLoai;
		this.moTa = moTa;
	}
	
	public Loai(String tenLoai, String moTa) {
		super();
		this.tenLoai = tenLoai;
		this.moTa = moTa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	
}
