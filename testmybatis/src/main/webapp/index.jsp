<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 使用ajax，需要引入jquery -->
<!-- <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script> -->
<script src="/common/js/jquery.js"></script>
<title>测试</title>
</head>

 
<body>
<!-- 前台页面 -->
	用户名：<input type="text" id="uname" name="uname"></input><br>
	密码：<input type="password" id="upassword" name="upassword"></input><br>
	<button id="login" >login</button>
	<!--   script代码   -->
<script type="text/javascript">
$(function(){
	console.log("111");
	var uname = $('#uname').val();
//console.log($('#uname').val())
	var upassword = $("#upassword").val();
	alert(uname);
	alert(upassword);
	$('#login').click(function(){
		alert(uname);
		alert(upassword);
		console.log(upassword);
		console.log(uname+""+upassword);
		$.ajax({
			url:'user/login.action',
			data:{uname:'dds1',upassword:'dds2'},
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
</body>

</html>
