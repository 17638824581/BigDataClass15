<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<body>
<div id="app">

    <h1>学生信息</h1>
    <table border="1">
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>生日</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.birthday}</td>
                <td><a href="">编辑</a> <a href="http://localhost/pro34/student/delete?id=${student.id}"
                                           target="_blank">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<hr>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

<form action="http://localhost/pro34/student/add" method="post">
    学生1：<br>
    姓名：<input type="text" name="studentList[0].name"/><br>
    年龄：<input type="text" name="studentList[0].age"/><br>
    生日：<input type="text" name="studentList[0].birthday"/><br>

    学生2：<br>
    姓名：<input type="text" name="studentList[1].name"/><br>
    年龄：<input type="text" name="studentList[1].age"/><br>
    生日：<input type="text" name="studentList[1].birthday"/><br>

    学生3：<br>
    姓名：<input type="text" name="studentList[2].name"/><br>
    年龄：<input type="text" name="studentList[2].age"/><br>
    生日：<input type="text" name="studentList[2].birthday"/><br>

    学生4：<br>
    姓名：<input type="text" name="studentList[3].name"/><br>
    年龄：<input type="text" name="studentList[3].age"/><br>
    生日：<input type="text" name="studentList[3].birthday"/><br>

    <input type="submit" value="添加"/><br>
</form>

<script>
    function submit() {
        alert("发送数据！")
        axios({
            url: "http://localhost/pro34/student/addJson",
            method:"post",
            // 放在 data 中的参数将来会放在 请求体 中
            data: [{
                id: 18,
                name: 'lisi',
                age: 20,
                birthday: 123456
            },{
                id: 18,
                name: 'lisi',
                age: 20,
                birthday: 123456
            }],
            // 放在 params 中的参数将来会放在 url 的 ? 后面
            params:{
                json:"abc"
            }
        }).then(function (resp) {
            console.log(resp.data);
        })
    }
</script>

<input type="submit" value="发送 JSON 格式数据到服务器" onclick="submit()"/>


<form method="get" action="http://localhost/pro34/student/param">
    姓名：<input name="name" type="text">
    <input type="submit" value="提交">
</form>

</body>

</html>