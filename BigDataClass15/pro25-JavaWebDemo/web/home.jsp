<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<style>
  table{
    margin: 40px auto;
  }
  h1,p{
    text-align: center;
  }
  th,td{
    padding: 5px 20px;
  }
</style>
<body>
<h1>书籍信息</h1>
<hr>
<p>
  <span>欢迎您：XXX</span>
  <a href="addBook.jsp">添加书籍</a>
  <a href="users.jsp">管理用户</a>
  <a href="">退出登录</a>
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
    <tr>
      <td>1</td>
      <td>示例书名</td>
      <td>示例作者</td>
      <td>示例类型</td>
      <td>示例价格</td>
      <td>
        <a href="">修改</a>
        <a href="">删除</a>
      </td>
    </tr>
  </tbody>
</table>

</body>
</html>
