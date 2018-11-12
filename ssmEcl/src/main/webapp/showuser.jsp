<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/common/easyUI/jquery.min.js"></script>
<script type="text/javascript">
$().ready(function(){
	$("#bt").click(function(){
		alert("hello");
	});
})
</script>
<title>showuser</title>
</head>
<body>
showuser
${user.userName}

<input type="button" value="新增" id="bt"></input>
</body>
</html>