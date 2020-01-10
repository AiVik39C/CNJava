package vn.java.banhang.modelRequest_Response;

public class ThanhToanRequest {
	private Long donHangId;

	public ThanhToanRequest(Long donHangId) {
		super();
		this.donHangId = donHangId;
	}

	public Long getDonHangId() {
		return donHangId;
	}

	public void setDonHangId(Long donHangId) {
		this.donHangId = donHangId;
	}
	
}
