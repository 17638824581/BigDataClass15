<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>书城首页</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        #logo {
            width: 240px;
            vertical-align: bottom;
        }

        #title-left > span {
            font-size: 44px;
            font-weight: bold;
            color: #1371b6;
        }

        #title {
            height: 30px;
            width: 1500px;
            margin: 0 auto;
            margin-top: 20px;
        }

        #title-left {
            float: left;
        }

        #title-right {
            float: right;
            font-size: 20px;
        }

        #title-right>a{
          color: #1371b6;
          font-weight: bold;
          text-decoration: none;
        }

        #title-right>a:hover{
          color: black;
        }

        #body {
            width: 1500px;
            height: 600px;
            border: 2px solid #1371b6;
            margin: 50px auto;
        }

        #filter {
            text-align: center;
        }

        #filter>p{
          margin-top: 10px;
        }

        input[type=text]{
          width: 50px;
        }

        #books {
            width: 1440px;
            height: 460px;
            /*border: 2px solid red;*/
            margin: 20px auto;
        }

        .book {
            width: 300px;
            height: 360px;
            padding-top: 40px;
            /*border: 2px solid #1371b6;*/
            border-radius: 10px;
            box-shadow: 0 0 5px #1371b6;
            float: left;
            margin-left: 44px;
            text-align: center;
        }

        .book > img {
            width: 200px;
        }

        .clear {
            clear: both;
        }

        #goto_page {
            margin-top: 20px;
            text-align: center;
            font-size: 18px;
        }

        #add-book{
            color: #1371b6;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div id="title">
    <div id="title-left">
        <img src="imgs/logo.jpg" id="logo">
        <span>网上书城</span>
    </div>
    <div id="title-right">
        欢迎：
        <a href="">小邢</a>
        |
        <a href="">登录</a>
        |
        <a href="">注册</a>
        |
        <a href="">购物车</a>
        |
        <a href="">后台管理</a>
    </div>
</div>
<div id="body">
    <div id="filter">
        <p>
        <form action="" method="post">
            价格:
            <input type="text" name="min">
            元-
            <input type="text" name="max">
            元
            <input type="submit" value="查询"/>
        </form>
        </p>
        <p>您的购物车中有3件商品</p>
        <p>您刚刚将<span id="add-book">《时间简史》</span>加入到了购物车中</p>
    </div>
    <div id="books">
        <div class="book">
            <img src="imgs/swk.jpg"><br>
            <span>书名：西游记</span><br>
            <span>作者：吴承恩</span><br>
            <span>价格：￥30.0</span><br>
            <span>销量：99</span><br>
            <span>库存：2000</span><br>
            <input type="button" value="加入购物车">
        </div>
        <div class="book">
            <img src="imgs/swk.jpg"><br>
            <span>书名：西游记</span><br>
            <span>作者：吴承恩</span><br>
            <span>价格：￥30.0</span><br>
            <span>销量：99</span><br>
            <span>库存：2000</span><br>
            <input type="button" value="加入购物车">
        </div>
        <div class="book">
            <img src="imgs/swk.jpg"><br>
            <span>书名：西游记</span><br>
            <span>作者：吴承恩</span><br>
            <span>价格：￥30.0</span><br>
            <span>销量：99</span><br>
            <span>库存：2000</span><br>
            <input type="button" value="加入购物车">
        </div>
        <div class="book">
            <img src="imgs/swk.jpg"><br>
            <span>书名：西游记</span><br>
            <span>作者：吴承恩</span><br>
            <span>价格：￥30.0</span><br>
            <span>销量：99</span><br>
            <span>库存：2000</span><br>
            <input type="button" value="加入购物车">
        </div>
        <div class="clear"></div>
        <div id="goto_page">
            <form action="" method="post">
                <a href="">首页</a>
                <a href="">上一页</a>
                <a href="">2</a>
                【3】
                <a href="">4</a>
                <a href="">下一页</a>
                <a href="">末页</a>
                共10页，30条记录
                到第<input type="text">页
                <input type="submit" value="确定">
            </form>
        </div>
    </div>
</div>
</body>
</html>