<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8"/>
<title>Fashion Style</title>
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
<!--/tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Grocery Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />



</head>
<body>
	 
	<div id='maincart'>
<h2>Giỏ Hàng Của Bạn</h2>
<p>Hiện có <span class='simpleCart_quantity'/> sản phẩm<br/>
Tổng Số Tiền: <span class='simpleCart_total'/><br/></p>
<ul>
<li><a class='simpleCart_empty' href='javascript:;'>Xóa Hết</a></li>
<li><a class='mycart' href='#'>Xem Giỏ Hàng</a></li>
</ul>
</div> 
	
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	<script src="js/jquery-ui.js"></script>
</body>

</html>