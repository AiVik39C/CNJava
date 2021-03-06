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

<title>Fashion Style</title>
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
	<!-- top Products -->
	<div class="ads-grid">
		<div class="container">
			<!-- tittle heading -->
			<h3 class="tittle-w3l">
				FASHION STYLE <span class="heading-style"> <i></i> <i></i> <i></i>
				</span>
			</h3>
			<!-- //tittle heading -->
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

					<h1>Chi tiết đơn hàng</h1>

					<form action="#" method="post">
						<label for="tenTaiKhoan">ID Loại sản phẩm:</label>
						<input type="text" id="tenTaiKhoan" name="tenTaiKhoan" placeholder="" >
						
					    <label for="ngayMua">Tên Loại sản phẩm:</label>
					    <input type="text" id="ngayMua" name="ngayMua" placeholder="" >
					</form>
							
					<h2></h2>
					<table style="width: 100%">
						<tr>
							
							<th style="text-align: center; vertical-align: middle;">ID đơn hàng</th>
							<th style="text-align: center; vertical-align: middle;">Tên tài khoản</th>
							<th style="text-align: center; vertical-align: middle;">Danh sách sản phẩm</th>
							<th style="text-align: center; vertical-align: middle;">Tổng số lượng</th>
							<th style="text-align: center; vertical-align: middle;">Tổng tiền</th>
							<th style="text-align: center; vertical-align: middle;">Ngày mua</th>
							<th style="text-align: center; vertical-align: middle;">Tình trạng đơn hàng</th>							
							<th style="text-align: center; vertical-align: middle;">Action</th>
						</tr>
						<tr>
							
							<c:forEach var="donhang" items="${listDonHang}">
						        
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.id_DonHang}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.taiKhoan.tenTaiKhoan}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.listSanPham[0].tenSanPham}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.tongSoLuong}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.tongTien}"/><p></td>							
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.ngayMua}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${donhang.tinhTrangDH}"/><p></td>
							<td style="text-align: center; vertical-align: middle;">
								<button type="button" >Xem chi tiết</button>
							</td>
							</c:forEach>
							
						</tr>
					</table>
				</div>
			</div>
			<!-- //product right -->
		</div>
	</div>
	<!-- //top products -->



	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	<!-- js-files -->
	<!-- jquery -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- //jquery -->

	<!-- popup modal (for signin & signup)-->
	<script src="js/jquery.magnific-popup.js"></script>
	<script>
		$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
				type : 'inline',
				fixedContentPos : false,
				fixedBgPos : true,
				overflowY : 'auto',
				closeBtnInside : true,
				preloader : false,
				midClick : true,
				removalDelay : 300,
				mainClass : 'my-mfp-zoom-in'
			});

		});
	</script>
	<!-- Large modal -->
	<!-- <script>
		$('#').modal('show');
	</script> -->
	<!-- //popup modal (for signin & signup)-->

	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
		paypalm.minicartk.render(); //use only unique class names other than paypalm.minicartk.Also Replace same class name in css and minicart.min.js

		paypalm.minicartk.cart
				.on(
						'checkout',
						function(evt) {
							var items = this.items(), len = items.length, total = 0, i;

							// Count the number of each item in the cart
							for (i = 0; i < len; i++) {
								total += items[i].get('quantity');
							}

							if (total < 3) {
								alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
								evt.preventDefault();
							}
						});
	</script>
	<!-- //cart-js -->

	<!-- price range (top products) -->
	<script src="js/jquery-ui.js"></script>
	<script>
		//<![CDATA[ 
		$(window).load(
				function() {
					$("#slider-range").slider(
							{
								range : true,
								min : 0,
								max : 9000,
								values : [ 50, 6000 ],
								slide : function(event, ui) {
									$("#amount").val(
											"$" + ui.values[0] + " - $"
													+ ui.values[1]);
								}
							});
					$("#amount").val(
							"$" + $("#slider-range").slider("values", 0)
									+ " - $"
									+ $("#slider-range").slider("values", 1));

				}); //]]>
	</script>
	<!-- //price range (top products) -->

	<!-- flexisel (for special offers) -->
	<script src="js/jquery.flexisel.js"></script>
	<script>
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems : 3,
				animationSpeed : 1000,
				autoPlay : true,
				autoPlaySpeed : 3000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 2
					}
				}
			});

		});
	</script>
	<!-- //flexisel (for special offers) -->

	<!-- password-script -->
	<script>
		window.onload = function() {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}

		function validatePassword() {
			var pass2 = document.getElementById("password2").value;
			var pass1 = document.getElementById("password1").value;
			if (pass1 != pass2)
				document.getElementById("password2").setCustomValidity(
						"Passwords Don't Match");
			else
				document.getElementById("password2").setCustomValidity('');
			//empty string means no validation error
		}
	</script>
	<!-- //password-script -->

	<!-- smoothscroll -->
	<script src="js/SmoothScroll.min.js"></script>
	<!-- //smoothscroll -->

	<!-- start-smooth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();

				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- //end-smooth-scrolling -->

	<!-- smooth-scrolling-of-move-up -->
	<script>
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			 */
			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->

	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- //js-files -->


</body>

</html>
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

					<h1>Chi tiết đơn hàng</h1>

							<div class="sanpham">
						<div class="left1" style="width: 100%">
					
								<label for="tentaikhoan">Tên tài khoản:</label><br>
								<input	type="text" id="tentaikhoan" name="tentaikhoan" placeholder=""><br>							
								
								<label for="donhang">Đơn hàng:</label><br>							
								<input	type="text" id="donhang" name="donhang" placeholder=""> <br>
							</div>
					</div>
							
					<h2>Danh sách sản phẩm</h2>
					<table style="width: 100%">
						<tr>
							
							<th style="text-align: center; vertical-align: middle;">ID sản phẩm</th>
							<th style="text-align: center; vertical-align: middle;">Tên sản phẩm</th>
							<th style="text-align: center; vertical-align: middle;">Loại</th>
							<th style="text-align: center; vertical-align: middle;">Số lượng</th>
							<th style="text-align: center; vertical-align: middle;">Giá tiền</th>
						</tr>
						<tr>
							
							<c:forEach var="sanpham" items="${listSanPham}">
						        
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.id_SanPham}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.tenSanPham}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.tongSoLuong}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.tongTien}"/><p></td>							
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.giaBan}"/><p></td>
							<td style="text-align: center; vertical-align: middle;"><c:out value ="${sanpham.tinhTrangDH}"/><p></td>
							</c:forEach>
						</tr>
						<tr>
							 <td colspan="5">Tổng tền:</td>
						</tr>
					</table>
				</div>
			</div>
			<!-- //product right -->
		</div>
	</div>
	<!-- //top products -->



	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	<!-- js-files -->
	<!-- jquery -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- //jquery -->

	<!-- popup modal (for signin & signup)-->
	<script src="js/jquery.magnific-popup.js"></script>
	<script>
		$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
				type : 'inline',
				fixedContentPos : false,
				fixedBgPos : true,
				overflowY : 'auto',
				closeBtnInside : true,
				preloader : false,
				midClick : true,
				removalDelay : 300,
				mainClass : 'my-mfp-zoom-in'
			});

		});
	</script>
	<!-- Large modal -->
	<!-- <script>
		$('#').modal('show');
	</script> -->
	<!-- //popup modal (for signin & signup)-->

	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
		paypalm.minicartk.render(); //use only unique class names other than paypalm.minicartk.Also Replace same class name in css and minicart.min.js

		paypalm.minicartk.cart
				.on(
						'checkout',
						function(evt) {
							var items = this.items(), len = items.length, total = 0, i;

							// Count the number of each item in the cart
							for (i = 0; i < len; i++) {
								total += items[i].get('quantity');
							}

							if (total < 3) {
								alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
								evt.preventDefault();
							}
						});
	</script>
	<!-- //cart-js -->

	<!-- price range (top products) -->
	<script src="js/jquery-ui.js"></script>
	<script>
		//<![CDATA[ 
		$(window).load(
				function() {
					$("#slider-range").slider(
							{
								range : true,
								min : 0,
								max : 9000,
								values : [ 50, 6000 ],
								slide : function(event, ui) {
									$("#amount").val(
											"$" + ui.values[0] + " - $"
													+ ui.values[1]);
								}
							});
					$("#amount").val(
							"$" + $("#slider-range").slider("values", 0)
									+ " - $"
									+ $("#slider-range").slider("values", 1));

				}); //]]>
	</script>
	<!-- //price range (top products) -->

	<!-- flexisel (for special offers) -->
	<script src="js/jquery.flexisel.js"></script>
	<script>
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems : 3,
				animationSpeed : 1000,
				autoPlay : true,
				autoPlaySpeed : 3000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 2
					}
				}
			});

		});
	</script>
	<!-- //flexisel (for special offers) -->

	<!-- smoothscroll -->
	<script src="js/SmoothScroll.min.js"></script>
	<!-- //smoothscroll -->

	<!-- start-smooth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();

				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- //end-smooth-scrolling -->

	<!-- smooth-scrolling-of-move-up -->
	<script>
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			 */
			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->

	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- //js-files -->


</body>

</html>