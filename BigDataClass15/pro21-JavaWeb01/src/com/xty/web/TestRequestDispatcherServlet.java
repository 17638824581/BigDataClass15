package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TestRequestDispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 通过请求转发，就可以将用户的一次请求，再转发给其他资源
        // 可以转发给 其他的 Servlet 程序
        // 也可以转发到 web 资源

        // 创建一个转发对象，需要给出要转发到的路径
        // 请求转发，支持访问 WEB-INF 下面的资源
        // 在我们 Tomcat 下面，相对路径的斜杠 / ，会被解析成： http://主机名:端口号/项目名称/

        RequestDispatcher rd = request.getRequestDispatcher("/page1.html");

        // 调用 转发对象的 forward() 方法来执行转发
        // 需要将 request 对象 和  response 对象都转发过去
        rd.forward(request,response);
    }

}
