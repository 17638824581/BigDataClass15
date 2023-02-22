<%--
Created by IntelliJ IDEA.
User: XTY
Date: 2023/2/22
Time: 14:30
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式内部运算表达式</title>
</head>
<body>
<%
    // request 域存数据
//    request.setAttribute("name","小邢");
%>

<h1>欢迎您：${empty param.name ? "您未登录！" : param.name }</h1>

</body>
</html>
