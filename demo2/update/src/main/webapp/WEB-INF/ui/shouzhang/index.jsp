<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
$(function(){  
	$.djs.call({ctxPath: "${pageContext.request.contextPath}", js: "/ui/shouzhang/index.js"},function(){  
		this.init();  
	});  
});  
</script> 
<div>shouzhang</div>
<input id="bt1" type="button" value="click"/>