<%--
  Created by IntelliJ IDEA.
  User: XTY
  Date: 2023/2/21
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出九九乘法表</title>
</head>
<body>
<table border="1">
    <tbody>
    <%
        for (int i = 1; i <= 9; i++) {
    %>
    <tr>
        <%
            for (int j = 1; j <= i; j++) {
        %>
        <td>
          <%=j%> x <%=i%> = <%=i*j%>
        </td>
        <%
            }
        %>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
