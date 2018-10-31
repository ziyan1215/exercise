<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 使用ajax，需要引入jquery -->
<!-- <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script> -->
<script src="/common/js/jquery.js"></script>
<title>测试</title>
	<link rel="stylesheet" type="text/css" href="common/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/demo.css">
    <script type="text/javascript" src="common/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="common/easyUI/jquery.easyui.min.js"></script>
</head>

 
<body>
<!-- 前台页面 -->
<div class="easyui-panel" title="login" style="width:100%;max-width:400px;padding:30px 60px;">
        <div style="margin-bottom:20px">
            <input id="uname" name="uname" class="easyui-textbox" label="用户名:" labelPosition="top" style="width:100%;">
        </div>
         <div  style="margin-bottom:20px">
            <input id="upassword" name="upassword" class="easyui-textbox" label="密码:" labelPosition="top" style="width:100%;">
        </div>
		<div>
	
            <a id="login" href="#"  class="easyui-linkbutton" iconCls="icon-ok" style="height:32px">login</a>
            <a id="bt" href="user/register.action"  class="easyui-linkbutton" iconCls="icon-edit" style="height:32px">Register</a>
        </div>
</di>
	
	<!--   script代码   -->
<script type="text/javascript">
$(function(){
	
	$('#bt').click(function(){
		console.log('bt click');
		console.log(uname);
		var uname1 = $('#uname').val();
		console.log(uname1);
	});
	
	$('#login').click(function(){
		var uname = $('#uname').val();
		//console.log($('#uname').val())
		var up = $("#upassword").val();

		$.ajax({
			url:'user/login.action',
			data:{uname:uname,upassword:up},
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
