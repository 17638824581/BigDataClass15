package com.xty.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.Charset;

public class TestResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Request 表示的是请求对象，包含了客户端发给我们的数据

        // Response 表示的是响应对象，包含了我们要发送给客户端的数据

        // 获取 Response 对象的 字节流
        // Response 给客户端发送的内容中文字符串会乱码
//        resp.setCharacterEncoding("utf-8");
        // 我们能不能告诉浏览器使用 utf-8 解码
//        resp.setContentType("text/html; charset=utf-8");
//        resp.setHeader("content-Type","image/jpeg");
//
//        // 给客户端传递图片文件内容
//        ServletOutputStream outputStream = resp.getOutputStream();
//
//        // 1.读取图片数据
//        FileInputStream fileInputStream = new FileInputStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro21-JavaWeb01\\web\\static\\imgs\\2.jpg");
//        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
//
//        // 2. 循环读取图片数据，再通过 outputStream 将数据写到响应体中
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = bis.read(bytes,0,bytes.length)) != -1){
//            outputStream.write(bytes,0,len);
//            outputStream.flush();
//        }
//
//        // 3.释放资源
//        outputStream.close();
//        bis.close();
//        fileInputStream.close();


        // 用于给客户端传递字符内容
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>Hello Response!</h1>");
//        writer.println("<h2>你好 Response!</h2>");
//        writer.println("<h3>今天天气很好！</h3>");


        // 使用 io 流读取 html 文件的内容，再通过 Response 的字符输出流，将 html 文件中的内容相应给客户端。
        //1. 使用字节输入流读取 html 文件的数据
//        FileReader fileReader = new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro21-JavaWeb01\\web\\index.html", Charset.forName("utf-8"));
//
//        PrintWriter writer = resp.getWriter();
//
//        char[] chars = new char[1024];
//        int len = 0;
//        while ((len = fileReader.read(chars,0,chars.length))!= -1){
//            //2. 使用 Response 的字符输出流，将读取到的文件数据，写入 Response 的响应体中
//            writer.write(chars,0,len);
//        }
//
//        // 3. 释放资源
//        writer.close();
//        fileReader.close();

    }
}
