<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--//tags -->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />	
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/sanpham.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/font-awesome.css" rel="stylesheet">
	<!--pop-up-box-->
	<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
	<!--//pop-up-box-->
	<!-- price range -->
	<link rel="stylesheet" type="text/css" href="css/jquery-ui1.css">
	<!-- fonts -->
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
<title>V2 Store</title>
<!--/tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Grocery Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
</head>
<body>
				<div class="side-bar col-md-3">

				<!-- food preference -->
				<div class="left-side">
					<h3 class="agileits-sear-head">Danh sách sản phẩm</h3>								
				</div>
				<!-- //food preference -->
				<!-- discounts -->
				<form action="create/nhacungcap" method="post" modelAttribute="ncc">
				<div class="left-side">
					<h3 class="agileits-sear-head.jsp">Quản lý</h3>
					<nav>
						<ul>
							<li ><a href="/sanpham">Quản lý sản phẩm</a></li>
						</ul>
						<ul>
							<li><a href="/user">Quản lý khách hàng</a></li>
						</ul>
						<ul>
							<li style="background: #008000"><a href="/nhacungcap">Quản lý nhà cung cấp</a></li>
						</ul>
						<ul>
							<li><a href="/loai">Quản lý loại sản phẩm</a></li>
						</ul>
						<ul>
							<li><a href="/donhang">Quản lý đơn hàng</a></li>
						</ul>
					</nav>
				</div>
				<!-- //discounts -->

			</div>
			<!-- //product left -->
			<!-- product right -->
			<div class="agileinfo-ads-display col-md-9">
				<div class="wrapper">

					<h1>Quản lý nhà cung cấp</h1>

					<div class="sanpham">
						<div class="left1" style="width: 100%">
					
								<label for="tenNCC">Tên nhà cung cấp:</label><br>
								<input	type="text" id="tenNCC" name="tenNhaCungCap" placeholder=""><br>							
								
								<label for="diachi">Địa chỉ:</label><br>							
								<input	type="text" id="diachi" name="diaChi" placeholder=""> <br>	
								
								<label for="sdt">Số điện thoại:</label> <br>	
								<input	type="text" id="sdt" name="soDienThoai" placeholder=""> <br>	
							</div>
					</div>


					<input type="submit"value="Thêm">
					<input type="submit"value="Sửa"> 
					<input type="submit" value="Xóa">
					</form>
					<h2>Danh sách nhà cung cấp</h2>
					<table style="width: 100%">
						<tr>
							
							<th style="text-align: center; vertical-align: middle;">ID nhà cung cấp</th>
							<th style="text-align: center; vertical-align: middle;">Tên nhà cung cấp</th>
							<th style="text-align: center; vertical-align: middle;">Địa chỉ</th>
							<th style="text-align: center; vertical-align: middle;">Số điện thoại</th>
						</tr>
						
							
							<c:forEach var="nhacungcap" items="${listNCC}">
						    <tr>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${nhacungcap.id_NCC}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${nhacungcap.tenNhaCungCap}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${nhacungcap.diaChi}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${nhacungcap.soDienThoai}"/><p></td>
							</tr>
							</c:forEach>
						
					</table>
				</div>
			</div>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	
</body>

</html>