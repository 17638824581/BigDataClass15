package com.dahua.web;

import com.dahua.bean.Book;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String type = request.getParameter("type");
        String price = request.getParameter("price");

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setType(type);
        book.setPrice(Double.parseDouble(price));

        BookService bookService = new BookServiceImpl();
        boolean add = bookService.add(book);
        // 如果添加成功，则跳转到主页，否则显示失败原因
        if (add){
            response.sendRedirect("/pro25/home");
        }else{
            request.setAttribute("msg","书籍添加失败！");
            request.getRequestDispatcher("/addBook.jsp").forward(request,response);
        }
    }
}
