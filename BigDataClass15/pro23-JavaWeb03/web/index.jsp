<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 配置jsp出错页面 --%>
<%@ page errorPage="error.jsp" %>


<%--<%--%>
<%--    // 向 request 域中存储一个 name 属性--%>
<%--    request.setAttribute("name","小王");--%>
<%--%>--%>


<jsp:include page="top.jsp">
    <jsp:param name="name" value="xty"/>
</jsp:include>

<%--<%@ include file="top.jsp"%>--%>

<%-- 使用声明脚本，声明一些变量 --%>
<%!
    // 声明一个 学生类（作为 jsp 翻译后的类的内部类）
    class Student {
        private int id;
        private String name;
        private int age;
        private String sex;

        public Student(int id, String name, int age, String sex) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }
    }


    // 定义一个List集合
    private ArrayList<Student> al = new ArrayList<>();
%>

<%-- 执行的 java 代码要写在 代码脚本中 --%>
<%

    // 生成十个学生对象，存入到 al 中
    for (int i = 0; i < 10; i++) {
        al.add(new Student(i, "学生" + i, i + 10, "男"));
    }

%>


<%-- 写Java代码脚本 --%>
<table border="1">
    <thead>
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>

    <%-- 使用 代码脚本 遍历 al 将十个学生信息 打印到页面上的表格里 --%>
    <%
        for (Student s : al) {
    %>
    <tr>
        <td><%= s.id %>
        </td>
        <td><%= s.name %>
        </td>
        <td><%= s.age %>
        </td>
        <td><%= s.sex %>
        </td>
    </tr>
    <%
        }
    %>

    </tbody>
</table>

<hr>

<%@ include file="bottom.jsp" %>