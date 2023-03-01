<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
<h1>修改书籍</h1>
<form method="post" action="/pro25/addBook">
  <input type="hidden" name="id" value="${book.id}">
  <label>书名：<input type="text" name="title" value="${book.title}" required></label><br>
  <label>作者：<input type="text" name="author" value="${book.author}" required></label><br>
  <label>类型：<input type="text" name="type" value="${book.type}" required></label><br>
  <label>价格：<input type="text" name="price" value="${book.price}" required></label><br>
  <p>${msg}</p>
  <input type="submit" value="确认修改">
</form>
<hr>
<a href="home.jsp">返回主页</a>
</body>
</html>
