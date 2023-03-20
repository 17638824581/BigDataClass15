<%--
  Created by IntelliJ IDEA.
  User: 12949
  Date: 2023/3/17
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>单文件上传</h1>
<form method="post" enctype="multipart/form-data" action="http://localhost/pro34/file/upload">
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    性别：<select name="sex"><br>
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
    个人照片：<input type="file" name="picture_file"><br>
    个人简历：<input type="file" name="word_file"><br>
    <input type="submit" value="上传"><br>
</form>

</body>
</html>
