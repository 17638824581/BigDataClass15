package com.xty.servlet;

import com.xty.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        // 1. 接收参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String email = request.getParameter("email");
        String auth_code = request.getParameter("auth_code");

        // 2. 验证验证码
        if (auth_code.toLowerCase().equals("3n3d")) {

            // 3. 验证两次密码
            if (!password.equals(repassword)) {
                response.getWriter().write("<srcipt> alert('两次密码不一致！'); location.replace('/pro22/regist.html')</srcipt>");
                return;
            }

            // 4. 调用对应的 Service 方法执行注册
            UserService userService = new UserService();
            // 5. 根据注册结果做出响应
            boolean register = userService.register(username, password, email);
            if (register) {
                response.getWriter().write("<script> alert('注册成功！'); location.replace('/pro22/regist.html')</script>");
            } else {
                response.getWriter().write("<script> alert('注册失败！用户名或邮箱重复！'); location.replace('/pro22/regist.html')</script>");
            }
        } else {
            response.getWriter().write("<script> alert('验证码错误！'); location.replace('/pro22/regist.html')</script>");
        }
    }
}
