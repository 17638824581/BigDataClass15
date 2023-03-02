package com.dahua.web;

import com.alibaba.fastjson.JSON;
import com.dahua.bean.Book;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/realUpdateBook")
public class RealUpdateBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String s = request.getReader().readLine();
        Book book = JSON.parseObject(s, Book.class);

        BookService bookService = new BookServiceImpl();
        boolean update = bookService.update(book.getId(), book);

        if (update){
            response.getWriter().write("ok");
        }else{
            response.getWriter().write("error");
        }

    }
}
