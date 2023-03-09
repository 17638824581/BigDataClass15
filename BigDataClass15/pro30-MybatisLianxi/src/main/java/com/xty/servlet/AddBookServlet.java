package com.xty.servlet;

import com.alibaba.fastjson.JSON;
import com.xty.pojo.Book;
import com.xty.service.BookService;
import com.xty.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        // 接受客户端传递来的 json 格式的 Book 数据
        String json = request.getReader().readLine();
        // 使用 FastJson 将 数据转为 Book 对象
        Book book = JSON.parseObject(json, Book.class);
        // 调用 BookService 的 add() 方法，将书籍数据存入数据库
        BookService bookService = new BookServiceImpl();
        boolean add = bookService.add(book);
        // 根据添加的结果响应状态给客户端
        if (add){
            // 添加成功
            response.getWriter().write("ok");
        }else{
            // 添加失败
            response.getWriter().write("error");
        }
    }
}
