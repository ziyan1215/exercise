<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<link rel="stylesheet" type="text/css" href="common/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="common/easyUI/themes/demo.css">
    <script type="text/javascript" src="common/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="common/easyUI/jquery.easyui.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div class="easyui-panel" title="Register" style="width:100%;max-width:400px;padding:30px 60px;">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Email:" labelPosition="top" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="First Name:" labelPosition="top" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Last Name:" labelPosition="top" style="width:100%;">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" label="Company:" labelPosition="top" style="width:100%;">
        </div>
        
        <div>
            <a id='register' class="easyui-linkbutton" iconCls="icon-ok" style="width:100%;height:32px">Register</a>
        </div>
    </div>
    
    <script type="text/javascript">
    	$(function(){
    		$('#register').click(function(){
    			$.ajax(
    					
    			);
    			
    		});
    	});
    </script>
  </body>
</html>
