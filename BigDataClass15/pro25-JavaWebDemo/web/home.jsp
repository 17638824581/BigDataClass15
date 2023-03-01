<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<style>
    table {
        margin: 40px auto;
    }

    h1, p {
        text-align: center;
    }

    th, td {
        padding: 5px 20px;
    }
</style>
<body>
<h1>书籍信息</h1>
<hr>
<p>
    <span>欢迎您：${user.name}</span>
    <a href="/pro25/addBook.jsp">添加书籍</a>
    <a href="/pro25/showUser">查看用户</a>
    <a href="/pro25/logout">退出登录</a>
</p>
<hr>
<table border="1">
    <caption>全部书籍</caption>
    <thead>
    <tr>
        <th>序号</th>
        <th>书名</th>
        <th>作者</th>
        <th>类型</th>
        <th>价格</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <%-- 遍历request域中的所有书籍信息 --%>
    <c:forEach items="${books}" var="book" varStatus="status">
      <tr>
        <td>${status.index + 1}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.type}</td>
        <td>￥${book.price}</td>
        <td>
          <a href="/pro25/updateBook?id=${book.id}">修改</a>
          <a href="/pro25/deleteBook?id=${book.id}">删除</a>
        </td>
      </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
