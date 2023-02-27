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
    <title>添加书籍</title>
</head>
<body>
<h1>添加书籍</h1>
<form method="" action="">
  <label>书名：<input type="text" name="title" required></label><br>
  <label>作者：<input type="text" name="author" required></label><br>
  <label>类型：<input type="text" name="type" required></label><br>
  <label>价格：<input type="text" name="price" required></label><br>
  <input type="submit" value="确认添加">
</form>
<hr>
<a href="home.jsp">返回主页</a>
</body>
</html>
