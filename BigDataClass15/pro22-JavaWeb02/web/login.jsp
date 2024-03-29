<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        #body {
            height: 600px;
            background-color: #1371b6;
        }

        #title {
            padding-top: 180px;
            text-align: center;
            font-size: 60px;
            font-weight: normal;
            color: white;
        }

        #zc-form, #title {
            margin-top: 50px;
            margin-left: 300px;
            width: 360px;
            height: 460px;
            float: left;
        }

        #zc-form {
            height: 280px;
            background-color: white;
            padding: 20px;
            margin-top: 120px;
            margin-left: 360px;
        }

        #zc-form > span {
            display: inline-block;
            font-size: 26px;
            margin-bottom: 40px;
            font-weight: bold;
        }

        #zc-form > a {
            font-size: 20px;
            margin-left: 160px;
            color: #1371b6;
        }

        #logo {
            width: 240px;
        }

        #register {
            font-size: 20px;
        }

        #register > input {
            font-size: 20px;
            margin-bottom: 30px;
        }

        #submit {
            margin-top: 20px;
            width: 360px;
            height: 40px;
            background-color: #1371b6;
            color: white;
            border: none;
            cursor: pointer;
        }

        #msg {
            font-size: 14px;
            text-align: center;
            color: red;
        }
    </style>
</head>
<body>
<img src="imgs/logo.jpg" id="logo"/>
<div id="body">
    <h2 id="title">欢迎登录</h2>
    <div id="zc-form">
        <span>会员登录</span>
        <a href="/pro22/regist.jsp">立即注册</a>
        <form id="register" action="/pro22/login" method="post">
            <label>用户名称：</label>
            <input type="text" name="username" value="${username}" placeholder="请输入用户名" required/><br>
            <label>用户密码：</label>
            <input type="password" name="password" placeholder="请输入密码" required/><br>
            <p id="msg">${msg}</p>
            <input type="submit" value="登录" id="submit">
        </form>
    </div>
</div>
</body>
</html>