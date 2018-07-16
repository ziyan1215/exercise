<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/favicon.ico">
<script type="text/javascript" src="${initParam.__public}/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${initParam.__public}/jquery/loader.js"></script>
<script type="text/javascript" src="${initParam.__public}/kendo_ui/js/kendoutils.js" ></script>
<script type="text/javascript" src="/pro/common/nh/nh.web.all.js" data-skin="custom" data-grid-baseUrl="${pageContext.request.contextPath}" ></script>
<div class="nhGridCache" style="display: none;"></div>

<script type="text/javascript">
kendo.culture("zh-CN");
$.ajaxSetup({
	cache: false,
	error: function(xhr, textStatus){//jquery .ajax请求错误统一处理方式			    	
		if(xhr.status!=200){
			var contextStr;
		    if(xhr.status==401||xhr.status==403||xhr.status==405|| (xhr.status==406 && xhr.responseText.indexOf("Error")==-1) ||xhr.status==500){
		    	contextStr=xhr.responseText;        
		    }else if(xhr.status==0){
		    	contextStr="服务器无响应,请联系管理员！";       
		    }else{
		    	contextStr="警告','连接服务器失败,请重试！";        
		    }    
			if($("#ajax_error_alert_div").length<=0){
				$(document.body).append("<div id='ajax_error_alert_div'></div>");
			}	    
		    $("#ajax_error_alert_div").html(contextStr);
		    var errorWin=$("#ajax_error_alert_div");
		    if(!errorWin.data("kendoWindow")){
		    	$("#ajax_error_alert_div").kendoWindow({
		    	 	draggable: true,
		    	    height: "250px",
		    	    modal: true,
		    	    resizable: true,
		    	    visible: false,
		    	    title: "请求错误",
		    	    width: "400px",
		    	    animation:false
		    	});
		    	errorWin.data("kendoWindow").center();
		    	errorWin.data("kendoWindow").open();
		    }else{
		    	errorWin.data("kendoWindow").center();
		    	errorWin.data("kendoWindow").open();
		    }	
		}
	}
});
</script>
<style>
html
{
    height:100%;
    color:#000;
    background:#fff;
    min-height:100%;
    overflow-y:scroll;
    font:75% arial,helvetica,sans-serif;
    margin:0;padding:0;
}

body
{
    height:100%;
    color:#000;
    background:#fff;
    min-height:100%; 
    margin:0;padding:0;
}
h1,h2{margin:0;padding:0;}
h1 {
	margin: 0px; height: 30px; line-height: 20px; font-size: 12px; cursor: pointer;
}
a img{border:0;}
a{text-decoration:none; }
</style>