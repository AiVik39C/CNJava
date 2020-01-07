package vn.java.banhang.modelRequest_Response;

import java.util.List;

public class BaseResponse {

	private Object data;
	private List<String> listError;
	public BaseResponse() {}
	public BaseResponse(Object data, List<String> listError) {
		super();
		this.data = data;
		this.listError = listError;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public List<String> getListError() {
		return listError;
	}
	public void setListError(List<String> listError) {
		this.listError = listError;
	}
	

}
