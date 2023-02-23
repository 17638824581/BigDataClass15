<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        #body{
            height: 600px;
            background-color: #1371b6;
        }
        #title{
            padding-top: 180px;
            text-align: center;
            font-size: 60px;
            font-weight: normal;
            color: white;
        }
        #zc-form,#title{
            margin-top: 50px;
            margin-left: 300px;
            width: 360px;
            height: 460px;
            float: left;
        }
        #zc-form{
            background-color: white;
            padding: 20px;
        }
        #zc-form>h3{
            font-size: 26px;
            margin-bottom: 40px;
        }
        #logo{
            width: 240px;
        }

        #register{
            font-size: 20px;
        }

        #register>input{
            font-size: 20px;
            margin-bottom: 20px;
        }
        #submit{
            margin-top: 30px;
            width: 360px;
            height: 40px;
            background-color: #1371b6;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[name=auth_code]{
            width: 160px;
        }
        #img-yzm{
            height: 30px;
            width: 90px;
            border: 1px solid black;
            position: relative;
            top: 10px;
        }

        #msg{
            font-size: 14px;
            color: red;
            text-align: center;
        }

        #back{
            text-align: center;
            font-size: 20px;
        }

        #back>a{
            color: #1371b6;
            text-decoration: none;
        }

        #back>a:hover{
            color: #003186;
        }

    </style>
    <script src="js/jQuery3.6.3.js"></script>
</head>
<body>
<img src="imgs/logo.jpg" id="logo"/>
<div id="body">
    <h2 id="title">欢迎注册</h2>
    <div id="zc-form">
        <h3>注册会员</h3>
        <form id="register" action="addUser" method="post">
            <label>用户名称：</label>
            <input type="text" name="username" value="${username}" required/><br>
            <label>用户密码：</label>
            <input type="password" name="password" value="${password}" required/><br>
            <label>确认密码：</label>
            <input type="password" name="repassword" value="${repassword}" required/><br>
            <label>电子邮件：</label>
            <input type="email" name="email" value="${email}" required/><br>
            <label>验证码：</label>
            <input type="text" name="auth_code"/>
            <img src="imgs/yzm.jfif" id="img-yzm">
            <br>
                <p id="msg">${msg}</p>
            <input type="submit" value="注册" id="submit">
        </form>
        <p id="back"><a href="/pro22/login.jsp">返回登录</a></p>
    </div>
</div>
</body>
</html>