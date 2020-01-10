<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Fashion Style</title>
<style>
.ngoai {
  margin: 15px
}
</style>
</head>
<body>
<div class="ngoai">
	 <form action="">
	<table width="100%" height="auto" >
		<tr>
		<c:forEach var="sanpham" items="${listSanPham}">
			<td>hình ảnh</td>
			<!--thông tin sản phẩm-->
			<td><c:out value ="${sanpham.moTa}"/></td>
		</c:forEach>
		</tr>
		
	</table>
	<h3 style="background-color:#CCCCCC">Chi tiết sản phẩm</h3><br>
	<table>
		<tr>
			<td>Thương hiệu</td>
			<td>
				<a href="index.jsp">Fashion Style</a>
			</td>
		</tr>
		
		<tr>
		<c:forEach var="sanpham" items="${listSanPham}">
			<td>Kho hàng</td>
			<td><c:out value ="${sanpham.soLuongNhap}"/></td> 
		</c:forEach>
		</tr>
		<tr>
			<td>Gửi từ</td>
			<td>390 Nguyễn Thái Học, Quang Trung, Quy Nhơn
		</tr>
	</table>
	<h3 style="background-color:#CCCCCC">Mô tả sản phẩm</h3><br>
		<div>	
			Đặc điểm sản phẩm: <br>
			- Mã Quà Tặng Fashion Style hứa hẹn sẽ là món quà giá trị mà bạn dành tặng đến người thân, bạn bè của mình. <br>
			- Mã Quà Tặng được áp dụng cho tất cả các sản phẩm có trên Fashion Style trừ mã thẻ điện thoại, thẻ sim, thẻ game và các sản phẩm Nạp Thẻ và Dịch Vụ <br>
			- Mã quà tặng chỉ được thanh toán bằng phương thức thanh toán qua ví AirPay.<br>
			Điều kiện sử dụng: <br>
			- Mã quà tặng tương ứng với 25.000đ tiền mặt. <br>
			- Mã quà tặng được sử dụng để mua hàng (trừ sim, mã thẻ, & sản phẩm Nạp thẻ và Dịch vụ) tại Fashion Style, bao gồm cả các sản phẩm trong chương trình khuyến mãi.<br> 
			- Mã Quà Tặng có thời gian sử dụng đến: 31-03-2020 23h59. <br>
			- Mã Quà Tặng không được áp dụng đổi trả. <br>
			- Mã không được chuyển đổi thành tiền mặt; Không được hoàn lại tiền thừa. <br>
			- Fashion Style sẽ không chịu trách nhiệm gì thêm trừ các lỗi kỹ thuật về mã và khách hàng không nhận được mã.<br>
			- Mã Quà Tặng không áp dụng cho: sim, mã thẻ điện thoại, thẻ game và không bao gồm phí vận chuyển.<br>

		</div>
	<h3 style="background-color:#CCCCCC">Đánh giá sản phẩm</h3><br>
			
	</form>
	</div>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	
</body>

</html>