package com.dahua.web;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到文件上传请求，处理数据...");

        // 在servlet接受数据的时候，
        // 对于 multipart/form-data 类型的数据
        // 要以 流的形式来接收

        // 调用 request 对象的 getInputStream() 方法，可以获取输入流来接受请求体数据
        ServletInputStream inputStream = req.getInputStream();

        // 读取流中的数据
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes,0,bytes.length))!=-1){
            // 将读取到的字节数据，转为字符串，打印这些数据
            String s = new String(bytes,0,len, Charset.forName("utf-8"));
            System.out.println(s);
        }

    }
}
