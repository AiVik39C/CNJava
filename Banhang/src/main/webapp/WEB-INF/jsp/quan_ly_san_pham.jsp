<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.sanpham {
	  display: -webkit-flex;
	  display: flex;
	}
  	h1{
  		text-align: center;
  	}
  	  	table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;    
}
  	
  	.left{
	  	-webkit-flex: 2;
	  	-ms-flex: 2;
	  	flex: 2;
  	}
  	.right{
  		-webkit-flex: 2;
  		-ms-flex: 2;
  		flex: 2;
  	}
	input[type=text], select {
		  width: 100%;
		  padding: 10px 20px;
		  margin: 8px 0;
		  display: inline-block;
		  border: 1px solid #ccc;
		  border-radius: 4px;
		  box-sizing: border-box;
	}
	input[type=password], select {
		  width: 100%;
		  padding: 10px 20px;
		  margin: 8px 0;
		  display: inline-block;
		  border: 1px solid #ccc;
		  border-radius: 4px;
		  box-sizing: border-box;
	}
		
	input[type=submit] {
		  width: 30%;
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
		
	div {
		  border-radius: 5px;
		  background-color: #f2f2f2;
		  padding: 20px;
	}
	.column {
		float: left;
		width: 50%;
		padding: 10px;
	}
	</style>
	<body>
		<h1>Quản lý sản phẩm</h1>
		
	<div class="sanpham">
		<div class="left">
			<h2>Nhập thông tin</h2>
		  	<form action="#" method="post">
			    <label for="id_SanPham">ID sản phẩm:</label>
			    <input type="text" id="id" name="id_sanpham" placeholder="" >
			
			    <label for="tensanpham">Tên sản phẩm:</label>
			    <input type="text" id="tensanpham" name="tensanpham" placeholder="" >
			  	
			  	<label for="sale">Sale:</label>
			    <input type="text" id="sale" name="sale" placeholder="" >
			  	
			   	<label for="giaban">Giá bán:</label>
			    <input type="text" id="giaban" name="giaban" placeholder="" >
			  
			  	<label for="ten_ncc">Tên nhà cung cấp:</label>
			    <input type="text" id="ten_ncc" name="ten_ncc" placeholder="" >
			  
			   	<label for="loai">Lọai:</label>
			    <input type="text" id="loai" name="loai" placeholder="" >
			  
			 	<label for="hinhanh">Hình ảnh:</label>
			    <input type="text" id="hinhanh" name="hinhanh" placeholder="" >
			    
			    <label for="mota">Mô tả:</label>
			    <input type="text" id="mota" name="mota" placeholder="" >
			    
			    <label for="soluongnhap">Số lượng nhập:</label>
			    <input type="text" id="soluongnhap" name="soluongnhap" placeholder="" >
			    
			    <input type="submit" value="Thêm">
			    <input type="submit" value="Sửa">
			    <input type="submit" value="Xóa">
		  </form>
	  </div>
	  <div class="right">
	  	<div class="column"">
    		<h2>Danh sách nhà cung cấp</h2>
    		<table style="width:100%">
	    		<tr>
	    			<th>ID sản phẩm</th>
	    			<th>Tên sản phẩm</th>
	    			<th>Sale</th>
	    			<th>Giá bán</th>
	    			<th>Tên nhà cung cấp</th>
	    			<th>Lọai</th>
	    			<th>Hình ảnh</th>
	    			<th>Mô tả</th>
	    			<th>Số lượng nhập</th>
	    			<th>Số lượng bán</th>
	    		</tr>
	    		<tr>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    			<td></td>
	    		</tr>
	    	</table>
  	</div>
	  </div>
	</div>

</body>
</html>