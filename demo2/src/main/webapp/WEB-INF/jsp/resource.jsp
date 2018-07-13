<%@page import="org.springframework.web.context.support.ServletContextResource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//1、注意文件资源地址相对于web应用根路径的方式表示
	Resource  res3 = new ServletContextResource(application,"");
%>

</body>
</html>