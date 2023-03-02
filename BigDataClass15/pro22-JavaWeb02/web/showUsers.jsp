<%@ page import="java.util.List" %>
<%@ page import="com.dahua.bean.User" %>
<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 1.引入jstl的核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>展示用户信息</title>
</head>
<body>

<table border="1">
    <caption>用户数据</caption>
    <thead>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>邮箱</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <%-- 使用 EL 表达式和 JSTL 实现展示用户数据的功能 --%>
    <%-- 1.使用 JSTL c:forEach 标签 来遍历 ${students} --%>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.email}</td>
            <td>${u.password}</td>
            <td>
                <a href="">修改</a>
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
