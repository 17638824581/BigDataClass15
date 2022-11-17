package com.xty.bytesStream;

import java.io.*;

/**
 * 使用字节流来打开图片文件，并读取内部数据。
 * @author Mr.yu
 * @date 2022/11/14 16:19
 */
public class ByteStreamOpenImage {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 使用字节输入流读取图片数据
        File file = new File("F:\\【重要】讲课文件\\大华\\大数据十五班\\讲课视频\\day31\\04 复习2.mp4");
        FileInputStream fis = new FileInputStream(file);

        // 再使用字节输出流，写入读取到的图片数据
        File newfile = new File("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\a.mp4");
        FileOutputStream fos = new FileOutputStream(newfile,true);

        // 每次复制一个字节
//        int val = 0;
//        while (val!=-1){
//            val = fis.read();
//            fos.write(val);
//        }
//
        // 每次复制一个字节数组(10kB)的数据
        // 做了一次缓冲，缓冲区指的就是 这个 字节数组
        // 缓冲区的大小，就是字节数组的长度
        byte[] bytes = new byte[102400];
        int len = 0;
        while (len != -1){
            len = fis.read(bytes);
            if (len==-1)break;
            fos.write(bytes,0,len);
        }

        // 关闭输入、输出流
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();

        System.out.println("程序耗时："+(end-start));

    }
}
