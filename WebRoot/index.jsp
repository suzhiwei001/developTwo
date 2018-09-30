<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta http-equiv="refresh" content ="0;url=/BussElement/findByBussElement"> -->
<title>index</title>
</head>
<body>
	<table>
		<tr>
			<td>jsp页面代码格式化</td>
		</tr>
		<tr>
			<td>方式1：crtl+i</td>
		</tr>
		<tr>
			<td>方式2：右键-》source-》Format Active Elements</td>
		</tr>
	</table>
	<%-- <jsp:include page="index2.jsp"/> --%>
	<a href="<%=basePath%>/BussElement/findByBussElement">要素</a>
	<a href="<%=basePath%>/SelectTest/test">ddd</a>
	<a href="<%=basePath%>/ForwardPage/forwardPages?name=exportExcel">导出excel测试</a>
</body> 
<script type="text/javascript" language="javascript">  
</script> 
</html>