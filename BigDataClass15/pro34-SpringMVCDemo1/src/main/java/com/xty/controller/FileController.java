package com.xty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
@RequestMapping("/file")
public class FileController {

    // 单文件上传
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(String name, String age, String sex, MultipartFile picture_file, MultipartFile word_file) throws IOException {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);

        System.out.println("picture_file = " + picture_file);
        System.out.println("word_file = " + word_file);

        saveFile(picture_file,"F:\\Desktop\\新建文件夹\\");
        saveFile(word_file,"F:\\Desktop\\新建文件夹\\");

        return "upload success";
    }

    private void saveFile(MultipartFile file,String dir) throws IOException {
        // 将接收到的文件数据保存到本地 F:\Desktop\新建文件夹
        InputStream inputStream = file.getInputStream();
        String filename = file.getOriginalFilename();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dir+filename));
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer,0,buffer.length)) != -1){
            bos.write(buffer,0,len);
            bos.flush();
        }
        bos.close();
        inputStream.close();
    }
}
