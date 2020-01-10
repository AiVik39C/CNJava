<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>V2 Store</title>
<style>
.ngoai {
  margin: 15px
}

input[type=submit] {
	float: right;
	width: 20%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
<header>
	<jsp:include page="head.jp"></jsp:include>
</header>
<header>
	<jsp:include page="head.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
</header>

<div class="ngoai">
	 <form action="">
	<table width="70%" height="auto" >
		<tr>
		
			<td><img src="images/ao1.jpg" alt=""> </td>
			<!--thông tin sản phẩm-->
			<td>
				ÁO DÀI CÁCH TÂN CHIM HẠC IN 3D<br>
				Chất liệu: Cát Thái in 3D<br>
				Size: S. M. L và XL<br>
				Màu sắc: đỏ , xanh và vàng<br>
				Hàng thiết kế form chuẩn. Ib để shop tư vấn nhiệt tình nhé
			</td>
		</tr>		
	</table>
	<div>
	<ul style = "background: #AAAAAA">
	
		CHI TIẾT SẢN PHẨM
		
	</ul>
		<table>
			<tr>
				<td>Danh Mục</td>
				<td><a href="/home">V2 Store</a>><a href="">Thời Trang Nữ</a>>Áo dài</td>
			</tr>
			<tr>
				<td>Thương hiệu</td>
				<td>Chanel</td>
			</tr>
			<tr>
				<td>Kiểu tay</td>
				<td>Tay lỡ</td>
			</tr>
			<tr>
				<td>Chất liệu</td>
				<td>Cát</td>
			</tr>
			<tr>
				<td>Xuất xứ</td>
				<td>Việt Nam</td>
			</tr>
			<tr>
				<td>Kho hàng</td>
				<td>95</td>
			</tr>
			<tr>
				<td>Gửi từ</td>
				<td>390 Nguyễn Thái Học, Quang Trung, Quy Nhơn, Bình Định</td>
			</tr>
		</table>
	</div>
	<!-- chuyển qa trang mua hàng-->
	<input type="submit"  value="Mua hàng">
	</form>
	</div> 

	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	
</body>

</html>