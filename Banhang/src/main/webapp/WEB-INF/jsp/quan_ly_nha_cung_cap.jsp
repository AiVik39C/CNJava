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
		<h1>Quản lý nhà cung cấp</h1>
		
	<div class="sanpham">
		<div class="left">
			<h2>Nhập thông tin</h2>
		  	<form action="#" method="post">
			    <label for="id_NCC">ID nhà cung cấp:</label>
			    <input type="text" id="id_NCC" name="id_NCC" placeholder="" >
			
			    <label for="tenncc">Tên nhà cung cấp:</label>
			    <input type="text" id="tenncc" name="tenncc" placeholder="" >
			  	
			  	<label for="diachi">Địa chỉ:</label>
			    <input type="text" id="diachi" name="diachi" placeholder="" >
			  	
			   	<label for="sdt">Số điện thoại:</label>
			    <input type="text" id="sdt" name="sdt" placeholder="" >
			  
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
	    			<th>ID nhà cung cấp</th>
	    			<th>Tên nhà cung cấp</th>
	    			<th>Địa chỉ</th>
	    			<th>Số điện thoại</th>
	    		</tr>
	    		<tr>
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