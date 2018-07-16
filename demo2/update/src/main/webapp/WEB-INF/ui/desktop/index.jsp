<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>系统首页</div>
<script type="text/javascript">  
$(function(){  
	$.djs.call({ctxPath: "${pageContext.request.contextPath}", js: "/ui/desktop/index.js"},function(){  
		this.init();  
	});  
});  
</script> 
<input type="button" id="test" value="Hello world！"/>
