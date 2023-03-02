package com.dahua.bytesStream;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {

        // BufferedInputStream
        // BuffereOutputStream
        // 这两个类代表这 缓冲输入/输出字节流

        long strat = System.currentTimeMillis();

        // 使用缓冲字节输入流读取图片数据
        File file = new File("E:\\test\\03 字节输入输出流.mp4");
        FileInputStream fis = new FileInputStream(file);  // 创建字节输入流
        BufferedInputStream bis = new BufferedInputStream(fis,202400);  // 在字节输入流的基础上，添加了一个缓冲区默认大小（8192）字节

        // 再使用缓冲字节输出流，写入读取到的图片数据
        File newfile = new File("G:\\视频.mp4");
        FileOutputStream fos = new FileOutputStream(newfile,true);
        BufferedOutputStream bos = new BufferedOutputStream(fos,202400);


        // 使用普通字节输入/输出流来复制视频
//        byte[] bytes = new byte[10240];
//        int len;
//        while ((len = fis.read(bytes,0,bytes.length)) != -1){
//            fos.write(bytes,0,len);
//        }


        // read() 从缓冲字节输入流中读取一个字节，从它内部的缓冲区读取。
        // 使用缓冲字节输入/输出流 来复制视频
        byte[] bytes = new byte[10240];
        int len;
        while ((len = bis.read(bytes,0,bytes.length)) != -1){
            bos.write(bytes,0,len);
        }


        // 关闭输入、输出流
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-strat));
    }
}
