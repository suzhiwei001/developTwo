<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=basePath%>/resources/jquery/jquery-2.1.1.js" type="text/javascript"></script>

<title>test2</title>
<script type="text/javascript">
<!--导出测试-->
function exportExcel(){
	location.href = "<%=basePath%>/ExportExcelController/exportList?ids=2";
}
</script>
</head>
<body>
<button onclick="exportExcel();">导出</button>
</body>
</html>