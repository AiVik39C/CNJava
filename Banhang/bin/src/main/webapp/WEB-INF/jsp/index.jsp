<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="zxx">


<head>
 
	<title>Grocery Shoppy an Ecommerce Category Bootstrap Responsive Web Template | Home :: w3layouts</title>
	<!--/tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Grocery Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!--//tags -->
	<!--pop-up-box-->
	<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
	<!--//pop-up-box-->
	<!-- price range -->
	<link rel="stylesheet" type="text/css" href="css/jquery-ui1.css">
	<!-- fonts -->
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
</head>

<body>
<div>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>
<div>
	<div>
				<!-- product left -->
			<div class="side-bar col-md-3">

				<!-- food preference -->
				<div class="left-side">
					<h3 class="agileits-sear-head">Giá tiền</h3>
					<ul>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Dưới 400.000</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Từ 400.000 đến 800.000</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Trên 800.000</span>
						</li>
					</ul>
				</div>
				<!-- //food preference -->
				<!-- discounts -->
				<div class="left-side">
					<h3 class="agileits-sear-head">Thương hiệu</h3>
					<ul>
						<li>Chanel</li>
						<li>Chanel</li>
						<li>Gucci</li>
						<li>LV</li>
							<c:forEach var="nhacungcap" items="${listNCC}">
								<input type="checkbox" class="checked">
								
								<span class="span"><c:out value ="${nhacungcap.tenNhaCungCap}"/></span>
							</c:forEach>
						</li>
					</ul>
				</div>
				<!-- //discounts -->
			</div>
			<!-- //product left -->
			
			
			<!-- product right -->
			<div class="agileinfo-ads-display col-md-9">
				<div class="wrapper">
					<!-- third section (oils) -->
										
					<div class="col-md-4 product-men">
							<div class="men-pro-item simpleCart_shelfItem">
								<div class="men-thumb-item">
									<a href="chitietsp/4"><img src="images/dam_nu.jpg" alt=""></a>
									
									<span class="product-new-top">New</span>
								</div>
								<div class="item-info-product ">
									<h4>
										<a href="single.html">Almonds, 100g</a>
									</h4>
									<div class="info-product-price">
										<span class="item_price">$149.00</span>
										<del>$280.00</del>										
									</div>
								</div>
									<div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
										<form action="#" method="post">
											<fieldset>
												<input type="hidden" name="cmd" value="_cart" />
												<input type="hidden" name="add" value="1" />
												<input type="hidden" name="business" value=" " />
												<input type="hidden" name="item_name" value="Almonds, 100g" />
												<input type="hidden" name="amount" value="149.00" />
												<input type="hidden" name="discount_amount" value="1.00" />
												<input type="hidden" name="currency_code" value="USD" />
												<input type="hidden" name="return" value=" " />
												<input type="hidden" name="cancel_return" value=" " />
												<input type="submit" name="submit" value="Add to cart" class="button" />
											</fieldset>
										</form>
									</div>

								</div>
							</div>
						</div>
					<!-- //third section (oils) -->
				</div>
			</div>
			<!-- //product right -->
		</div>
	</div>
	<!-- //top products -->
</div>
	
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>


</body>

</html>