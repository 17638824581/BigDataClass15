<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>欢迎登录</title>
</head>
<body>
<h1>欢迎登录</h1>
<hr>
<form method="post" action="/pro25/login">
    <%-- 如果 request 域中存在username属性，则显示用户名 --%>
    <c:if test="${requestScope.username != null}">
        <label>账号：<input type="text" name="username" value="${requestScope.username}" required/></label><br>
        <label>密码：<input type="password" name="password" value="" required/></label><br>
    </c:if>
    <%-- 如果reuest 域中没有 username 属性，则从 cookie 取--%>
    <c:if test="${requestScope.username == null}">
        <label>账号：<input type="text" name="username" value="${cookie.username.value}" required/></label><br>
        <label>密码：<input type="password" name="password" value="${cookie.password.value}" required/></label><br>
    </c:if>

    <p>${msg}</p>
    <label>记住密码：<input type="checkbox" name="remember" value="remember"></label><br>
    <input type="submit" value="登录">
</form>
<hr>
<a href="regist.jsp">没有账号？</a>
</body>
</html>
