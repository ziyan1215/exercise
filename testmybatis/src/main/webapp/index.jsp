<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 使用ajax，需要引入jquery -->
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
 
<title>测试</title>
</head>
<!--   script代码   -->
<script type="text/javascript">
$(function(){
	var uname = $('#uname').val();
	var upassword = $("#upassword").val();
	$('#login').click(function(){
		$.ajax({
			url:'user/login.action',
			data:{uanme:uname,upassword:upassword},
			type:'post',
			async:false,
			success:function(data){
				//如果登录成功:弹出：登陆成功，否则：弹出失败
				alert(data);
			}
		});
	});	
});
</script>
 
<body>
<!-- 前台页面 -->
	用户名：<input type="text" id="uname" name="uname"></input><br>
	密码：<input type="password" id="upassword" name="upassword"></input><br>
	<button id="login" >login</button>
</body>
</html>
