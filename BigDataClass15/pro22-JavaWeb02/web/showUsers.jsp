<%@ page import="java.util.List" %>
<%@ page import="com.xty.bean.User" %>
<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示用户信息</title>
</head>
<body>
<%-- 1. 取出 request 域中的用户数据 --%>
<%
    List<User> users = (List<User>) request.getAttribute("users");
%>

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
    <%-- 2. 遍历并展示用户数据 --%>
    <%
        for (User u : users) {
    %>

    <tr>
        <td><%=u.getId()%>
        </td>
        <td><%=u.getUsername()%>
        </td>
        <td><%=u.getEmail()%>
        </td>
        <td><%=u.getPassword()%>
        </td>
        <td>
            <a href="">修改</a>
            <a href="">删除</a>
        </td>
    </tr>

    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
