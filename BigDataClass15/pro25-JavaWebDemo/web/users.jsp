<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>管理用户</title>
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
</head>
<body>
<h1>用户信息</h1>
<hr>
<p>
  <a href="home.jsp">返回主页</a>
</p>
<hr>
<table border="1">
  <caption>全部用户</caption>
  <thead>
  <tr>
    <th>序号</th>
    <th>昵称</th>
    <th>账号</th>
    <th>邮箱</th>
    <th>操作</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td>1</td>
    <td>用户昵称</td>
    <td>用户账号</td>
    <td>用户邮箱</td>
    <td>
      <a href="">修改</a>
      <a href="">删除</a>
    </td>
  </tr>
  </tbody>
</table>

</body>
</html>
