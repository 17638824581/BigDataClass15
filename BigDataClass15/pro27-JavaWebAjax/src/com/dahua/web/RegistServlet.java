package com.dahua.web;

import com.dahua.bean.User;
import com.dahua.service.UserService;
import com.dahua.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理乱码
        request.setCharacterEncoding("utf-8");

        // 获取参数
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String email = request.getParameter("email");

        // 验证两次密码是否一致
        if (password != null && password.equals(repassword)){
            // 包装参数
            User user = new User();
            user.setUsername(username);
            user.setName(name);
            user.setPassword(password);
            user.setEmail(email);

            UserService userService = new UserServiceImpl();
            if (userService.add(user)){
                // 用户注册成功，跳转到登录页面
                request.setAttribute("username",username);
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }else{
                // 用户注册失败
                request.setAttribute("msg","用户注册失败，用户名或邮箱重复！");
                request.getRequestDispatcher("/regist.jsp").forward(request,response);
            }
        }else{
            // 两次密码不一致
            request.setAttribute("msg","两次密码有误！");
            request.getRequestDispatcher("/regist.jsp").forward(request,response);
        }
    }
}
