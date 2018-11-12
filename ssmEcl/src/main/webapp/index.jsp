<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 浣跨敤ajax锛岄渶瑕佸紩鍏query -->
<!-- <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script> -->
<script src="/common/js/jquery.js"></script>
<title>login</title>
	<link rel="stylesheet" type="text/css" href="common/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/demo.css">
    <script type="text/javascript" src="common/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="common/easyUI/jquery.easyui.min.js"></script>
</head>

 
<body>

<form action="user/login.action" method="post">
	<input type="text" name="uname"></input>
	<input type="passworld" name="upassword"></input>
	 <input type="submit" value="Submit" />
</form>
	

</body>

</html>
