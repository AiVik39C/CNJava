<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>V2 Store</title>
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
<header>
			<!-- product left -->
			<div class="side-bar col-md-3">

				<!-- food preference -->
				<div class="left-side">
					<h3 class="agileits-sear-head">Danh sách sản phẩm</h3>						
				</div>
				<!-- //food preference -->
				<!-- discounts -->
				<div class="left-side">
					<h3 class="agileits-sear-head.jsp">Quản lý</h3>
					<nav>
						<ul>
							<li><a href="/sanpham">Quản lý sản phẩm</a></li>
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

					<h1>Quản lý sản phẩm</h1>

					<div class="sanpham">
						<div class="left">
							<form action="create/sanpham" method="post" enctype = "multipart/form-data">
								
								<label	for="tensanpham">Tên sản phẩm:</label> 
								<input type="text"	id="tensanpham" name="tenSanPham" placeholder=""> 
								
								<label	for="sale">Sale:</label> 
								<input type="text" id="sale"name="giam" placeholder=""> 
								
								<label for="giaban">Giá	bán:</label> 
								<input type="text" id="giaban" name="giaBan"placeholder="">
								
								<label for="ten_ncc">Tên nhà cung cấp:</label> 
								<select name="nhaCungCap">
									  
									  	<c:forEach var="sanpham" items="${listNhaCungCap}">
									  		<option value="<c:out value ="${sanpham.id_NCC}"/>">
									         	<c:out value ="${sanpham.tenNhaCungCap}"/><p>
									    	</option>
									    </c:forEach>
										
								</select>

							
						</div>
						<div class="right">
							<div class="column"">

								<label for="sanpham">Tên loại:</label>
								<select name="loai">
								
									  		<c:forEach var="loai" items="${listLoai}">
									  			  <option value="<c:out value ="${loai.id}"/>">
									         		<c:out value ="${loai.tenLoai}"/><p>
									         	</option>
									     	</c:forEach>
										
								</select>
								
								
								<label for="hinhanh">Hình ảnh:</label> 
								<input type="file" name="hinhAnh">
								
								<label for="mota">Mô tả:</label> 
								<input	type="text" id="mota" name="moTa" placeholder=""> 
								
								<label	for="soluongnhap">Số lượng nhập:</label> 
								<input type="text"	id="soluongnhap" name="soLuongNhap" placeholder="">
								
							</div>
						</div>
					</div>


					<input type="submit" value="Thêm"> 
					<input type="submit"value="Sửa"> 
					<input type="submit" value="Xóa">
					</form>
					<h2>Danh sách sản phẩm</h2>
					<table style="width: 100%" id="table-sanpham">
						<tr>
							
							<th style="text-align: center; vertical-align: middle;">ID sản phẩm</th>
							<th style="text-align: center; vertical-align: middle;">Tên sản phẩm</th>
							<th style="text-align: center; vertical-align: middle;">Sale</th>
							<th style="text-align: center; vertical-align: middle;">Giá bán</th>
							<th style="text-align: center; vertical-align: middle;">Tên nhà cung cấp</th>
							<th style="text-align: center; vertical-align: middle;">Lọai</th>
							<th style="text-align: center; vertical-align: middle;">Hình ảnh</th>
							<th style="text-align: center; vertical-align: middle;">Mô tả</th>
							<th style="text-align: center; vertical-align: middle;">Số lượng nhập</th>
						</tr>
						
							
							<c:forEach var="sanpham" items="${listSanpham}">
						        <tr onclick="clickRow(<c:out value ="${sanpham.id_SanPham}"/>)">
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.id_SanPham}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.tenSanPham}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.giam}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.giaBan}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.nhaCungCap.tenNhaCungCap}"/><p></td>							
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.loai.tenLoai}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><img src="<c:out value ="${sanpham.hinhAnh}"/>"><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.moTa}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.soLuongNhap}"/><p></td>
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

<script>
	function clickRow($id) {
		
// 		console.log($('#table-sanpham').DataTable());
	}
</script>