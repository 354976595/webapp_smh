
<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2017/12/17
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href=<%=basePath%>/>
    <title>添加宝图信息</title>
</head>
<body>
1231
<div style="width: 400px;height: 300px;background-color: burlywood">
    <table>


    </table>



</div>
${msg}
${modelMap}
</body>
</html>
