package com.dahua.charStream;

import java.io.*;

public class CharStreamTest {
    public static void main(String[] args) throws IOException {

        // 字符流
        //  Reader类，是 字符输入流的基类
        //  Writer类，是 字符输出流的基类

        // 所谓的字符流，就是 对 字节流进行了一次封装，让字节流读取、写入数据的时候，自动进行 解码、编码
        //  字符流  =  字节流 + 字符集

        // 尝试使用字符流 来读取 小说里的内容
        // 1.创建一个字节输入流
        // 有一个简化我们创建字符输入流的类

        // 读取小说中的内容，之前每次 读取 100 个字符。
        //  然后在这 100 个字符中找 哈利。

        // 字符缓冲输入流4`

        // FileReader 是简化创建操作的 字符输入流
//        FileReader fr = new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\books\\《哈利波特1-哈利波特与魔法石》.txt", Charset.forName("utf-8"));
//        // BufferedReader 类是 缓冲字符输入流
//        BufferedReader br = new BufferedReader(fr);
//        // readLine() 从字符输入流中读取一行字符（按照 \n、\r）来判断是否换行
//
//        // 遍历整个小说的内容，同时统计 哈利 出现了几次
//        int count = 0;
//        String data = "";
//        while ((data = br.readLine()) != null){
//            count += data.split("哈利").length - 1;
//        }
//
//        System.out.println("整本小说中，哈利共出现了"+count+"次");


        // 字符输出流
        // Writer

        // OutputStreamWriter 类就是 Writer 抽象类的 子类
//        FileOutputStream fos = new FileOutputStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\stu.txt",true);
//        // 使用 字节输入流 fos 创建一个字符输出流，同时可以指定字符集
//        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        // FileWriter
//        FileWriter fw = new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\stu.txt",Charset.forName("utf-8"),true);
//
//
//        // 通过字符输出流向文件中 写入（内存中暂存）字符
//        // \n 就是换行的意思 ，\n 是一个字符
//        // \r 回车，在不同的平台上有不同的效果，
//        // \t 水平制表符，具体的效果和一个 tab 键差不多
//        // \b 退格
//        //  像这样前面有个反斜杠\，后面跟上一个字母的字符，我们称为“转义字符”
//        //  如果只是想打印一个反斜杠 \\ 怎么办？
//        //  如果想要打印一个 \"
//        fw.write("静夜思\n");
//        fw.write("床前明月光，疑似地上霜。\n");
//        fw.write("举头望明月，低头思故乡。\n");
//
//        // 关闭字符输出流（输出流在关闭时会自动刷新一次，将之前写入的内容真正写到硬盘上。）
//        fw.close();


        // 能否使用 字符流 来复制一个视频文件？  字符流不能操作非文本文件！
//        String path = "F:\\【重要】讲课文件\\大华\\大数据十五班\\讲课视频\\day34\\03 字符流与文件读写案例2.mp4";
//
//        String path2 = "F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\newFile.mp4";
//
//        FileReader fr = new FileReader(path);
//        FileWriter fw = new FileWriter(path2,true);
//
//        // 每次复制 一个字符数组
//        char[] chars = new char[1024];
//        int len;
//        while ((len = fr.read(chars,0,chars.length)) != -1){
//            fw.write(chars,0,len);
//        }
//
//
//        // 关闭流
//        fw.close();
//        fr.close();
    }
}