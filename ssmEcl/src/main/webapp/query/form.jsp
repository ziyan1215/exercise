<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="<%=request.getContextPath()%>/items/queryformpost.action" method="post"> 
     用户名:&nbsp;<input type="text" name="name"/><br/>
     密&nbsp;&nbsp;码:&nbsp;<input type="text" name="id"/><br/>
     <input type="submit" value="提交"/> 
     <input type="reset" value="重置"/> 
</form> 
</body>
</html>