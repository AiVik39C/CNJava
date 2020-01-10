package vn.java.banhang.modelRequest_Response;

public class AddOrderRequest {
	private Long userId;
	private Long sanPhamId;
	public AddOrderRequest(Long userId, Long sanPhamId) {
		super();
		this.userId = userId;
		this.sanPhamId = sanPhamId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getSanPhamId() {
		return sanPhamId;
	}
	public void setSanPhamId(Long sanPhamId) {
		this.sanPhamId = sanPhamId;
	}
	
}
