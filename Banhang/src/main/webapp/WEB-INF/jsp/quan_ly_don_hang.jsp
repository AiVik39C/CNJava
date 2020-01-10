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
<style>
	
</style>

<title>V2 Store</title>
<!--/tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Grocery Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>

</head>
<body>
			<!-- product left -->
			<div class="side-bar col-md-3">

				<!-- food preference -->
				<div class="left-side">
					<h3 class="agileits-sear-head" >Danh sách sản phẩm</h3>
					
						
				</div>
				<!-- //food preference -->
				<!-- discounts -->
				<div class="left-side">
					<h3 class="agileits-sear-head.jsp">Quản lý</h3>
					<nav>
						<ul>
							<li><a href="">Quản lý sản phẩm</a></li>
						</ul>
						<ul>
							<li><a href="/user">Quản lý khách hàng</a></li>
						</ul>
						<ul>
							<li><a href="/nhacungcap">Quản lý nhà cung	cấp</a></li>
						</ul>
						<ul>
							<li><a href="/loai">Quản lý loại sản phẩm</a></li>
						</ul>
						<ul>
							<li  style="background: #4CAF50"><a href="/donhang">Quản lý đơn hàng</a></li>
						</ul>
					</nav>
				</div>
				<!-- //discounts -->

			</div>
			<!-- //product left -->
			<!-- product right -->
			<div class="agileinfo-ads-display col-md-9">
				<div class="wrapper">

					<h1>Danh sách đơn hàng</h1>


							
					<h2></h2>
					<table style="width: 100%">
						<tr>
							
							<th style="text-align: center; vertical-align: middle;">ID đơn hàng</th>
							<th style="text-align: center; vertical-align: middle;">Tổng tiền</th>
							<th style="text-align: center; vertical-align: middle;">Tình trạng đơn hàng</th>							
							<th style="text-align: center; vertical-align: middle;">Action</th>
						</tr>
						<tr>
							
							<c:forEach var="donhang" items="${listDonHang}">
						        
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.id_DonHang}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.tongSoLuong}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.tinhTrangDH}"/><p></td>
							<td style="text-align: center; vertical-align: middle;">
								<a href="chi_tiet_don_hang.jsp"><button type="button">Xem chi tiết</button></a>
							</td>
							</c:forEach>
							
						</tr>
					</table>
				</div>
			</div>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>

</html>