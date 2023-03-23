<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
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
        <tr>
            <td>1</td>
            <td>TOM</td>
            <td>1234</td>
            <td>
                <a href="">删除</a>
                <a href="">修改</a>
            </td>
        </tr>
    </tbody>
</table>

<hr>
<h2>添加账户</h2>
<form >
    账户名：<input type="text" name="name"/>
    余额：<input type="text" name="money"/>
    <input type="submit" value="添加账户"/>
</form>

<hr>
<h2>转账业务</h2>
<form >
    转出账户名：<input type="text" name="outName"/>
    转入账户名：<input type="text" name="inName"/>
    金额：<input type="text" name="money"/>
    <input type="submit" value="添加账户"/>
</form>

</body>
</html>
