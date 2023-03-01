package com.dahua.web;

import com.dahua.bean.Book;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/realUpdateBook")
public class RealUpdateBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String type = request.getParameter("type");
        Double price = Double.parseDouble(request.getParameter("price"));

        int id = Integer.parseInt(request.getParameter("id"));

        Book newbook = new Book();
        newbook.setType(title);
        newbook.setAuthor(author);
        newbook.setType(type);
        newbook.setPrice(price);

        BookService bookService = new BookServiceImpl();

        boolean update = bookService.update(id, newbook);

        if (update){
            // 修改成功，跳转到主页
            response.sendRedirect("/pro25/home");
        }else{
            // 修改失败，回显错误信息
            request.setAttribute("msg","修改失败！");
            request.getRequestDispatcher("/updateBook?id="+id);
        }
    }
}
