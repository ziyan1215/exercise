<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
<title>统一开发平台Demo工程</title>
<%@include file="/WEB-INF/ui/_common/header.jsp" %>
<script type="text/javascript">
$(function() {
	var curModule = "${actionBean.module}";
	var curMenuItem = "${actionBean.menuItem}";
	$.nh.loadMenu(curModule,curMenuItem);
});
</script>
</head>
	<body>
		<div id="m_header">
			<div class="k-content">
				<div>			
					<div style="height:78px;background-image:url('common/images/bg.jpg');">
						<div style="position: absolute; float:left; font-size: 24px; font-weight:bold; margin: 20px 0 10px 20px;">Demo工程</div>
						<table width="100%" border="0" height="70px">
							<tr>
								<td align="right">
									<font style="align:right;font-size:13px;color:black;margin-right: 10px;"></font>
								</td>
								<td align="right" rowspan="3" width="70px" style="padding: 18px 10px 0px 0px;">
									<a style="align:right;font-size:13px;color:black;margin-right: 30px;" href="${logoutUrl}">
									<img title="退出登录" src="<%=request.getContextPath()%>/common/images/exit.png"></a>
									<a href="${logoutUrl}"><span style="display: block; color:black; padding-right:15px;">退出登录</span></a>
								</td>
							</tr>
						    <tr>
								<td align="right">
									<div id="currentTime" style="align:right;font-size:13px;color:black;margin-right: 15px;height: 22px;"></div>
								</td>
							</tr>
							<tr>
								<td align="right">
								    <font style="align:right;font-size:13px;color:black;margin-right: 0px;">欢迎您，${actionBean.account.userName}&nbsp;</font>
									&nbsp;&nbsp;
								</td>
							</tr>
					     </table>
					</div>
				</div>
				<div id="menu-navigate"  class="k-content">
					<div id="application_menu_hide_div" class="k-content" style="display:none;">
						${actionBean.menuStr}
					</div>
					<div id="application_menu_div"></div>		
				</div>
			</div>
		</div>
		<div id="mainDiv" style="display:none;">
			功能展示区
		</div>
		<%@include file="/WEB-INF/ui/_common/tail.jsp"%>
	</body>
</html>