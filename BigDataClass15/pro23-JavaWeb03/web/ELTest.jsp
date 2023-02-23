<%@ page import="com.xty.bean.Student" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/22
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>

<%
    // 创建一个 学生对象
    Student stu1 = new Student();
    stu1.setName("小王");
    stu1.setAge(20);
    stu1.setPrice(90.6);
    stu1.setLocation("北京市延庆区大榆树镇");

    Student stu2 = new Student();
    stu2.setName("小张");
    stu2.setAge(16);
    stu2.setPrice(88.9);
    stu2.setLocation("河南省洛阳市洛龙区");

    Student stu3 = new Student();
    stu3.setName("小美");
    stu3.setAge(17);
    stu3.setPrice(99.9);
    stu3.setLocation("河南省南阳市卧龙区");

    // 使用数组来存储学生信息
//    Student[] students = {stu1, stu2, stu3};
    // 使用 List 集合来存储学生信息
//    ArrayList<Student> students = new ArrayList<>();
//    students.add(stu1);
//    students.add(stu2);
//    students.add(stu3);

    // 使用 Map 集合来存储学生信息
    LinkedHashMap<String, Student> map = new LinkedHashMap<>();
    map.put("stu1", stu1);
    map.put("stu2", stu2);
    map.put("stu3", stu3);

    request.setAttribute("stus", map);

    // 使用代码脚本向域中存数据
//      pageContext.setAttribute("name","小王");
//      request.setAttribute("name","小张");
//      session.setAttribute("name","小黑");
//      application.setAttribute("name","小东");
//
//      // 定义一个变量
//      String name = "小张";
%>

<%-- 使用 表达式脚本来取出数据
    表达式脚本取数据如果没有，则为 null
 --%>
<%--  <h2>姓名：<%= ((Student)request.getAttribute("stu")).getName() %></h2>--%>
<%--  <h2>年龄：<%= ((Student)request.getAttribute("stu")).getAge() %></h2>--%>
<%--  <h2>分数：<%= ((Student)request.getAttribute("stu")).getPrice() %></h2>--%>
<%--  <h2>地址：<%= ((Student)request.getAttribute("stu")).getLocation() %></h2>--%>

<hr>

<%-- 使用 EL 表达式来取数据
     EL 表达式只是去 域对象中取数据。
     EL 表达式不会取 Java 中的变量
     EL 如果取数据没有 则为 空字符串
     我们从 与对象中取 stu 出来是一个学生对象
     ${stu.name}  -----> stu.getName()；
 --%>

<%--<%--%>
<%--    //遍历学生数组--%>
<%--    Student[] stus = (Student[]) request.getAttribute("stus");--%>

<%--    for (int i = 0; i < stus.length; i++) {--%>
<%--        Student stu = stus[i];--%>
<%--        // 将遍历到的学生对象放到域中 以便 el 表达式来使用--%>
<%--        pageContext.setAttribute("stu",stu);--%>
<%--%>--%>
<%--        <h2>姓名：${stu.name}</h2>--%>
<%--        <h2>年龄：${stu.age}</h2>--%>
<%--        <h2>分数：${stu.price}</h2>--%>
<%--        <h2>地址：${stu.location}</h2>--%>
<%--        <hr>--%>
<%--<%--%>
<%--    }--%>
<%--%>--%>

<%-- 使用 EL 表达式操作 List 集合
 --%>

<%--
<%
    ArrayList<Student> stus = (ArrayList<Student>) request.getAttribute("stus");
    for (Student s : stus) {
%>
    <h2>姓名：${s.name}</h2>
    <h2>年龄：${s.age}</h2>
    <h2>分数：${s.price}</h2>
    <h2>地址：${s.location}</h2>
    <hr>
<%
    }
%>
--%>


<%-- 使用 EL 表达式操作 Map 集合 --%>

<%--
      如何遍历 Map 集合？
--%>

<%

    LinkedHashMap<String, Student> stus = (LinkedHashMap<String, Student>) request.getAttribute("stus");
    // 1.获取 map 集合中所有的键
    Set<String> keys = stus.keySet();
    for (String key : keys) {
        // 2.根据键拿值
        Student student = stus.get(key);
        pageContext.setAttribute("stu", student);
%>
    <h2>姓名：${stu.name}</h2>
    <h2>年龄：${stu.age}</h2>
    <h2>分数：${stu.price}</h2>
    <h2>地址：${stu.location}</h2>
    <hr>
<%
    }
%>

</body>
</html>
