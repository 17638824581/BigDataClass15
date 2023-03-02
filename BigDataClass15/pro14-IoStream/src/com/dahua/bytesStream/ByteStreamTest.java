package com.dahua.bytesStream;

import java.io.*;

public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        // 字节输入流基类-> InputStream
        // InputStream 是一个抽象类，我们使用它下面的子类 -> FileInputStream 类

        // 输入流-> 代表我们需要从外部输入数据到我们java程序中-> 需要从外部读取数据。
        // 尝试读取 java.txt 文件中的数据

//        FileInputStream fis = new FileInputStream("./pro14-IoStream/itgeek/java.txt");

        // read() 方法：从字节输入流中读取下一个字节。如果没有内容，则返回-1

        // read(byte[] b) 方法：从字节输入流中一次性读取数组 b 长度的数据，返回实际读取到的数据长度。

        // read(byte b, int off, int len)：
        //      尝试从字节输入流中读取最多 len 个字节的数据，
        //      将读取到的数据从数组 b 的 off 索引位开始存储。
        //      实际读取长度作为返回值返回。


        // 输出流基类 -> OutputStream
        // 输出流 -> 代表我们要从 java 程序中 向外部输出数据 -> 向硬盘上写数据。

        // FileOutputStream 是 OutputStream 类的子类。

//        File file = new File("./pro14-IoStream/itgeek/test.txt");

        // 通过 file 对象创建一个 字节输出流，默认使用的 覆盖模式写入
        //  如果们在后面填上 true ，表示 以 追加模式写入
//        FileOutputStream fos = new FileOutputStream(file, false);

        // 写入一个字节数据
//        fos.write(65);
        // 写入一个字节数组的数据
        // 写入 65 ~ 122 之间的字节数组
//        for (int i = 65; i < 123 ; i++) {
//            fos.write(i);
//        }

        // 关闭输出流
//        fos.close();

    }
}
