package vn.java.banhang.modelRequest_Response;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import vn.java.banhang.model.DonHang;
import vn.java.banhang.model.StatusDonHang;

public class DonHangResponse {
	private Long idDonHang;	
	private String hoTenNguoiMua;
	private Integer tongSoLuong;
	private Float tongTien;
	private String ngayMua;
	private StatusDonHang tinhTrangDH;
	private List<DonHangSanPhamResponse> list;
	public DonHangResponse(DonHang donHang) {
		super();
		this.idDonHang = donHang.getId_DonHang();
		this.hoTenNguoiMua = donHang.getTaiKhoan().getHoTen();
		this.tongSoLuong = donHang.getListDonHangSanPham().size();
		this.tongTien = donHang.getTongTien();
		Date myDate = Date.from(donHang.getNgayMua());
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String formattedDate = formatter.format(myDate);
		this.ngayMua = formattedDate;
		this.tinhTrangDH = donHang.getTinhTrangDH();
		list = donHang.getListDonHangSanPham().stream().map(donHangSP -> new DonHangSanPhamResponse(donHangSP))
					.collect(Collectors.toList());;
	}
	
}
