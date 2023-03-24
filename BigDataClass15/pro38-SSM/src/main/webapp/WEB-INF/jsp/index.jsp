<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>账户信息</h2>
<table>
    <thead>
    <tr>
        <th>账户id</th>
        <th>账户名</th>
        <th>账户余额</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${accounts}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
                <td>
                    <a href="http://localhost/pro38/delete?id=${account.id}" >删除</a>
                    <a href="http://localhost/pro38/delete?id=${account.id}" >修改</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<hr>
<h2>添加账户</h2>
<form  method="post" action="http://localhost/pro38/add">
    账户名：<input type="text" name="name"/>
    余额：<input type="text" name="money"/>
    <input type="submit" value="添加账户"/>
</form>

<hr>
<h2>转账业务</h2>
<form method="post" action="http://localhost/pro38/transfer">
    转出账户名：<input type="text" name="outName"/>
    转入账户名：<input type="text" name="inName"/>
    金额：<input type="text" name="money"/>
    <input type="submit" value="确认转账"/>
</form>

</body>
</html>
