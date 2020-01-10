package vn.java.banhang.modelRequest_Response;

import vn.java.banhang.model.DonHangSanPham;

public class DonHangSanPhamResponse {
	private Long idSanPham;
	private int soLuong;
	private String tenSanPham;
	private Float giaBan;
	public DonHangSanPhamResponse(DonHangSanPham donHangSanPham) {
		super();
		this.idSanPham = donHangSanPham.getSanPham().getId_SanPham();
		this.tenSanPham = donHangSanPham.getSanPham().getTenSanPham();
		this.soLuong = donHangSanPham.getSoLuong();
		this.giaBan = donHangSanPham.getSanPham().getGiaBan();
	}
	
}
