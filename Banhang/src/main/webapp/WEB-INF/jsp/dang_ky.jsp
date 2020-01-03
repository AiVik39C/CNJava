<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Đăng nhập</title>
  <meta charset="utf-8">
  <link href="css/sanpham.css" rel="stylesheet" type="text/css" media="all" />
  <style>
  	
  	form {
  border: 3px solid #f1f1f1;
}

/* Full-width inputs */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}
h2{
 text-align:center
 }
/* Extra style for the cancel button (red) */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
  width: 40%;
  border-radius: 50%;
}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* The "Forgot password" text */
span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 100%;
  }
 

  </style>
</head>
<body>

<div class="container">
  
<form action="action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1>Đăng ký</h1>
    <p>xin hãy điền đầy đủ thông tin</p>
    <hr>

    <label for="tendangap"><b>Tên đăng nhập:</b></label>
    <input type="text" placeholder="" name="ten" required>

    <label for="psw"><b>Mật khẩu:</b></label>
    <input type="password" placeholder="" name="psw" required>

    <label for="hoten"><b>Họ tên:</b></label>
    <input type="text" placeholder="" name="hoten" required>
    
	<label for="gioitinh"><b>Giới tính:</b></label>
    <select class="gt">
    	<option>Nam</option>
    	<option>Nữ</option>
    </select><br>
    
     <label for="sdt"><b>Số điện thoại:</b></label>
    <input type="text" placeholder="" name="sdt" required>
    
     <label for="email"><b>Email:</b></label>
    <input type="text" placeholder="" name="email" required>
    
   
    <div class="clearfix">
      <button type="submit" class="signupbtn">Đăng ký</button>
    </div>
    <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Hủy</button>
  </div>
  </div>
</form>





</body>
</html>
