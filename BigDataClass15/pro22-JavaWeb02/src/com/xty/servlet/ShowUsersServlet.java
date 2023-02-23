package com.xty.servlet;

import com.xty.bean.User;
import com.xty.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAll")
public class ShowUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 通过 Service 拿到所有用户数据
        List<User> allUser = new UserService().getAllUser();
        // 2. 将获取到的用户数据存到 request 域中
        request.setAttribute("users",allUser);
        // 3. 将请求转发到 showUsers.jsp 中
        request.getRequestDispatcher("/showUsers.jsp").forward(request,response);
    }
}
