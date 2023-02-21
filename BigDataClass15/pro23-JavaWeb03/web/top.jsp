<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  * {
    margin: 0;
    padding: 0;
  }

  #top {
    padding: 10px 20px;
    background-color: pink;
  }
</style>
<div id="top">
  <h3>欢迎您：<%=request.getParameter("name")%></h3>
  <p>
    <a href="/pro23">点我回到主页</a>
    <a href="/pro23/hello1.jsp">hello1</a>
    <a href="/pro23/hello2.jsp">hello2</a>
    <a href="/pro23/output.jsp">output</a>
    <a href="">test</a>
  </p>
</div>