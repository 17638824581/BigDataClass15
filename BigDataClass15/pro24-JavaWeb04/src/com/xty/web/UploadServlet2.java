package com.xty.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/upload2")
public class UploadServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 判断是否为多段数据请求
        // 2. 如果是多段数据请求，使用 ServletFileUpload 的 parseRequest() 方法，直接将所有数据解析为 List<FileItem>
        // 3. 遍历 List<FileItem> 集合，判断那个 FileItem 是文件类型。
        // 4. 如果是文件类型，则 调用它自己的 write() 方法将文件存储到指定位置。


        System.out.println("以接收到请求！");
        // 对请求数据上传的类型做潘顿
        if (ServletFileUpload.isMultipartContent(req)) {
            System.out.println("这个请求是多段数据类型！");
            // 如果是多段数据类型，则需要使用 fileupload 组件进行解析
            ServletFileUpload sfu = new ServletFileUpload();
            // 设置 fileupload对象的 FileItemFactory
            sfu.setFileItemFactory(new DiskFileItemFactory());
            // 可以直接将 多端数据类型的 数据，解析为 FileItem 对象所组成的 List 集合
            try {
                // 将所有提交的数据解析为 List<FileItem>
                List<FileItem> fileItems = sfu.parseRequest(req);

                // FileItem 就是我们提交的每个表单项
                // 遍历每个 FileItem对象 ，就是在遍历提交的表单项内容
                for (FileItem fileItem : fileItems) {

                    // 判断这个 fileIte 是普通类型还是文件类型
                    if (fileItem.isFormField()){
                        // 是普通类型
                        String name = fileItem.getFieldName();
                        String string = fileItem.getString("utf-8");
                        System.out.println("普通表单项："+name+"="+string);
                    }else{
                        // 是文件类型 fileItem
                        String name = fileItem.getName();
                        System.out.println("文件表单项："+name);
                        // 将上传的文件存到服务器的硬盘上
                        fileItem.write(new File("D://upload_files/"+name));

                        System.out.println("文件接收完成！");
                    }
                }

            }catch (Exception e) {
                throw new RuntimeException(e);
            }

        }else{
            System.out.println("这个请求不是多段数据类型！");
            // 如果不是多段数据类型，则可以直接使用 getParameter() 方法获取请求参数
        }
    }
}
