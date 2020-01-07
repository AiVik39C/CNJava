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
  border: 1px solid #ccc;
  width: 450px;
}
#form_login{
left: 55%;
    top: 60%;
    margin-left: -25%;
    position: absolute;
    margin-top: -25%;
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


  
  <form action="/dangnhap" id="form_login" modelAttribute="taikhoan" method="post"> 
<h2>ĐĂNG NHẬP</h2>
  <div class="container">
    <label for="tendangnhap"><b>Tên đăng nhập:</b></label>
    <input type="text" placeholder=""  name="tenTaiKhoan" path= "tenTaiKhoan">

    <label for="matKhau"><b>Password:</b></label>
    <input type="password" placeholder="" name="matKhau" path= "matKhau">

    <button type="submit" class="signinbtn">Đăng nhập</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Nhớ mật khẩu
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Hủy</button>
    <span class="psw">Quên <a href="#">mật khẩu</a></span>
  </div>
  
  
</form>

<script>
window.onload = function () {
	document.getElementById("tenTaiKhoan").onchange = validatePassword;
	document.getElementById("matKhau").onchange = validatePassword;
}
function validateForm()
{
    // Bước 1: Lấy giá trị của username và password
    var username = document.getElementById('tenTaiKhoan').value;
    var password = document.getElementById('matKhau').value;
 
    // Bước 2: Kiểm tra dữ liệu hợp lệ hay không
    if (username == ''){
        alert('Bạn chưa nhập tên đăng nhập');
    }
    else if (password == '')
    {
        alert('Bạn chưa nhập mật khẩu');
    }
    else{
        alert('Dữ liệu hợp lệ, ta có thể chấp nhận submit form');
        return true;
    }
 
    return false;
}
		
</script>
</body>
</html>
