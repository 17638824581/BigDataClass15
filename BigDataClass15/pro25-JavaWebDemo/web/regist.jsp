<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/2/26
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h1>欢迎注册</h1>
<hr>
<form method="post" action="/pro25/regist">
    <label>账号：<input type="text" name="username" required/></label><br>
    <label>昵称：<input type="text" name="name" required/></label><br>
    <label>密码：<input type="text" name="password" required/></label><br>
    <label>确认密码：<input type="text" name="repassword" required/></label><br>
    <label>邮箱号：<input type="email" name="email" required/></label><br>
    <p>${msg}</p>
    <input type="submit" value="确认注册"><br>
</form>
<hr>
<a href="index.jsp">返回登录</a>
</body>
</html>
