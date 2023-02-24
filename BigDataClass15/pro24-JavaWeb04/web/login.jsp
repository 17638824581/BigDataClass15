<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/24
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/pro24/login" method="post">
    <input type="text" name="username" placeholder="请输入账号" >
    <input type="password" name="password" placeholder="请输入密码">
    <p>${msg}</p>
    <input type="submit" value="登录">
</form>

</body>
</html>
