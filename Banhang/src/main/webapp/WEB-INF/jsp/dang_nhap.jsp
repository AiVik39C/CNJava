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
  <h2>ĐĂNG NHẬP</h2>
  <form action="" method="post">

  <div class="container">
    <label for="uname"><b>Tên đăng nhập:</b></label>
    <input type="text" placeholder="" name="uname" required>

    <label for="psw"><b>Password:</b></label>
    <input type="password" placeholder="" name="psw" required>

    <button type="submit">Đăng nhập</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Nhớ mật khẩu
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Hủy</button>
    <span class="psw">Quên <a href="#">mật khẩu</a></span>
  </div>
</form>

</div>


</body>
</html>
