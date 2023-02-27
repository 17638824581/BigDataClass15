<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
</head>
<body>
<h1>欢迎登录</h1>
<hr>
<form method="" action="">
    <label>账号：<input type="text" name="username" required/></label><br>
    <label>密码：<input type="text" name="password" required/></label><br>
    <p>${msg}</p>
    <label>记住密码：<input type="checkbox" name="remember" value="remember"></label><br>
    <input type="submit" value="登录">
</form>
<hr>
<a href="regist.jsp">没有账号？</a>
</body>
</html>
