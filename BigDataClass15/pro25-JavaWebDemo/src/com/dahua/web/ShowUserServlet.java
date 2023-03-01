package com.dahua.web;

import com.dahua.bean.User;
import com.dahua.dao.impl.UserDaoImpl;
import com.dahua.service.UserService;
import com.dahua.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/showUser")
public class ShowUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        List<User> users = userService.selectAll();
        request.setAttribute("users",users);
        request.getRequestDispatcher("/users.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
