<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="top.jsp" %>

<%--
    在 jsp 文件中，输出数据。
--%>


<h1>我是 H1 标签</h1>

<button>我是按钮</button>

<style>
    h1 {
        color: red;
    }
</style>

<script>
    document.getElementsByTagName("button")[0].onclick = function () {
        alert("点我干嘛！")
    }
</script>


<%@ include file="bottom.jsp"%>
