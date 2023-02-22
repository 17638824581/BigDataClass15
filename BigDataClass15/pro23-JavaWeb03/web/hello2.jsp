<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- 静态包含 --%>
<%--<%@ include file="top.jsp"%>--%>

<%-- 动态包含 --%>
<%--<jsp:include page="top.jsp"></jsp:include>--%>

<h1>我是 hello2.jsp</h1>


<%--
    在 hello2 jsp 中获取 刚刚 hello1.jsp 存储的数据
--%>

<h3><%= pageContext.getAttribute("name")%>
</h3>
<h3><%= request.getAttribute("name")%>
</h3>
<h3><%= session.getAttribute("name")%>
</h3>
<h3><%= application.getAttribute("name")%>
</h3>

<%-- 将底部信息栏包含到我们 hello1.jsp 的尾部 --%>
<%--<%@ include file="bottom.jsp"%>--%>
<jsp:include page="bottom.jsp"></jsp:include>