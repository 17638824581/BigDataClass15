package com.dahua.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 接受用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 2.验证用户名密码
        if (username.equals("xingtingyu") && password.equals("123456")){
            // 登录成功，跳转到主页
            // 将用户名存到 request 域中
            // request域中的数据并不能长久的保存下来
            // 只要用户访问了新的请求，新的请求中，不会有我们刚刚存储的 用户数据

            // 想要将用户数据长期的存起来 —— 使用 Cookie 技术

            // 1.创建Cookie对象，每一个Cookie对象都表示一对键值对数据
//            Cookie cookie1 = new Cookie("username",username);
//            Cookie cookie2 = new Cookie("password",password);
//
//            // 2.要将 Cookie 发送给客户端浏览器，客户端浏览器收到Cookie 就会将这些数据存起来，存到浏览器的内存中。
//            response.addCookie(cookie1);
//            response.addCookie(cookie2);

            // 3. 请求重定向
            response.sendRedirect("/pro24/home.jsp");
        }else{
            // 登录失败，携带错误信息返回登录页面
            // 将用户名存到 request 域中
            request.setAttribute("msg","用户名或密码错误！");
            // 请求转发到主页
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
}
