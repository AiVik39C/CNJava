
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>V2 Store</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="js/jquery-1.11.1.min.js"></script>

<style type="text/css">.table&amp;amp;gt;tbody&amp;amp;gt;tr&amp;amp;gt;td, .table&amp;amp;gt;tfoot&amp;amp;gt;tr&amp;amp;gt;td {  
vertical-align: middle;
}
 
@media screen and (max-width: 600px) { 
table#cart tbody td .form-control { 
width:20%; 
display: inline !important;
} 
 
.actions .btn { 
width:36%; 
margin:1.5em 0;
} 
 
.actions .btn-info { 
float:left;
} 
 
.actions .btn-danger { 
float:right;
} 
 
table#cart thead {
display: none;
} 
 
table#cart tbody td {
display: block;
padding: .6rem;
min-width:320px;
} 
 
table#cart tbody tr td:first-child {
background: #333;
color: #fff;
} 
 
table#cart tbody td:before { 
content: attr(data-th);
font-weight: bold; 
display: inline-block;
width: 8rem;
} 
 
table#cart tfoot td {
display:block;
} 
table#cart tfoot td .btn {
display:block;
}
}</style>
</head>
<body>
<header>
	<jsp:include page="head.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
</header>

<h2 class="text-center">Giỏ hàng</h2>
<div class="container"> 
 <table id="cart" class="table table-hover table-condensed"> 
  <thead> 
   <tr> 
    <th style="width:50%">Tên sản phẩm</th> 
    <th style="width:10%">Giá</th> 
    <th style="width:8%">Số lượng</th> 
    <th style="width:22%" class="text-center">Thành tiền</th> 
    <th style="width:10%"> </th> 
   </tr> 
  </thead> 
  <tbody>
  <c:forEach var="donHang" items="${listDonHang}">
  <tr> 
   <td data-th="Product"> 
   
    <div class="row"> 
    <c:forEach var="donHangSanPham" items="${donHang.getListDonHangSanPham()}">
     <div class="col-sm-2 hidden-xs"><a href="/sanpham/${donHangSanPham.getSanPham().id_SanPham}"><img width="100"
											src="<c:out value ="${donHangSanPham.getSanPham().hinhAnh}"/>" alt=""></a> 
     </div> 
     <div class="col-sm-10"> 
      <h4 class="nomargin">
			<c:out value="${donHangSanPham.getSanPham().tenSanPham}" />
		</h4>
      <p><c:out value="${donHangSanPham.getSanPham().moTa}" /></p> 
     </div> 
     </c:forEach>
    </div> 
   </td> 
   <td></td>
   
   <td>${donHang.getTongSoLuong()}</td>
   <td>${Math.round(donHang.getTongTien())}</td>

<!--    <td class="actions" data-th=""> -->
<!--     <button class="btn btn-info btn-sm"><i class="fa fa-edit"></i> -->
<!--     </button>  -->
<!--     <button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i> -->
<!--     </button> -->
<!--    </td>  -->
  </tr> 
  </c:forEach>
  </tbody>
  
  
  
  <tfoot> 
   <tr class="visible-xs"> 
    <td class="text-center"><strong>Tổng 200.000 đ</strong>
    </td> 
   </tr> 
   <tr> 
    <td><a href="http://hocwebgiare.com/" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
    </td> 
    <td colspan="2" class="hidden-xs"> </td> 
    <td class="hidden-xs text-center"><strong>Tổng tiền 500.000 đ</strong>
    </td> 
    <td><a href="" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
    </td> 
   </tr> 
  </tfoot> 
 </table>
</div>

</body>
</html>