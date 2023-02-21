<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>hello1.jsp</title>
</head>
<body>

<%@ include file="top.jsp" %>

<h1>我是Hello1.jsp</h1>


<%
    // 使用代码脚本向 四大域对象中 存储数据
    // pageContext 域 只在当前 jsp 页面中有效
    pageContext.setAttribute("name", "pageConext的数据");
    // request 域 只在同一个请求下有效
    request.setAttribute("name", "request的数据");
    // session 域 只在同一个会话中有效
    session.setAttribute("name", "session的数据");
    // application 在整个项目内有效
    application.setAttribute("name", "application的数据");
%>

<h3><%= pageContext.getAttribute("name")%>
</h3>
<h3><%= request.getAttribute("name")%>
</h3>
<h3><%= session.getAttribute("name")%>
</h3>
<h3><%= application.getAttribute("name")%>
</h3>

<%--
    请求转发，可以将一次请求的数据转发到其他的 Servlet 程序中
--%>
<%--<%--%>
<%--    // 使用请求转发，将当前访问的 request 和 repsonse 转发给 hello2.jsp--%>

<%--    //1.获取转发对象    //2.进行转发--%>
<%--    request.getRequestDispatcher("/hello2.jsp").forward(request, response);--%>
<%--%>--%>

<%-- 请求转发标签 --%>
<jsp:forward page="hello2.jsp"></jsp:forward>

<%-- 将底部信息栏包含到我们 hello1.jsp 的尾部 --%>
<%@ include file="bottom.jsp"%>

</body>

</html>




