<%@ page import="com.dahua.bean.Student" %>
<%@ page import="java.sql.Array" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- 引入 jstl 标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL标签库</title>
</head>
<body>
<%
    request.setAttribute("flag", "0");

    // 生成一个包含一百名学生信息的 ArrayList
    ArrayList<Student> students = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
        students.add(new Student("学生" + i, i, i * 10, "地址" + i));
    }

    // 把这些学生信息放入 request 域中
    request.setAttribute("stus", students);
%>

<%-- JSTL 中有一个 叫做 c:if 的标签 --%>
<c:if test="${flag == \"1\"}">
    <h1>欢迎登录！</h1>
</c:if>
<c:if test="${flag != \"1\"}">
    <h1>您未登录，请先登录！</h1>
</c:if>

<hr>

<%-- 使用 EL 表达式遍历 names 数组  --%>
<%--<%
    String[] names1 = (String[]) request.getAttribute("names");
    for (int i = 0; i < names1.length; i++) {
        String s = names1[i];
        response.getWriter().write(s);
    }
%>--%>

<%-- c:foreach 标签
    遍历 names 数组

 --%>

<table border="1">
    <thead>
    <tr>
        <th>学生名</th>
        <th>学生年龄</th>
        <th>学生分数</th>
        <th>学生地址</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stus}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.price}</td>
            <td>${student.location}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>