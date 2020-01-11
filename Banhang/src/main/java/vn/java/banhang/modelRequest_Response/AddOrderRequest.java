package vn.java.banhang.modelRequest_Response;

public class AddOrderRequest {
//	private Long userId;
//	private int soLuong;
	private Long sanPhamId;
	public AddOrderRequest(Long sanPhamId) {
		super();
//		this.userId = userId;
		this.sanPhamId = sanPhamId;
//		this.soLuong = soLuong;
	}
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
	public Long getSanPhamId() {
		return sanPhamId;
	}
	public void setSanPhamId(Long sanPhamId) {
		this.sanPhamId = sanPhamId;
	}
//	public int getSoLuong() {
//		return soLuong;
//	}
//	public void setSoLuong(int soLuong) {
//		this.soLuong = soLuong;
//	}
	
}
