package com.dahua.otherStream;

import com.dahua.homework.Student;

import java.io.*;

public class OtherStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 在 Java 中除了 字节流、字符流之外。
        // 还提供了一些特殊的流：
        //  1. 标准流
        //   1.1 标准输入流：System.in 我们从键盘录入数据的流。
        //   1.2 标准输出流：System.out 打印的内容到我们程序的控制台中。

        // 我们能不能从键盘输入内容，将键盘输入的内容保存到文件中

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\test.txt", Charset.forName("utf-8"), true));
//
//        for (int i = 0; i < 10; i++) {
//            bw.write(br.readLine());
//            bw.newLine();
//        }
//
//        bw.close();
//        br.close();


        //  2. 打印流 printStream ：标准输出流的类型是打印流。

        // 要向文件中写入文本
        // FileWriter->BufferedWriter->wrtie(String)
//        FileWriter fw = new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\test.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("张三");
//        bw.newLine();


//        PrintStream ps = new PrintStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\test.txt");
//        ps.println("张三");

        //  特点：提供一些打印方法。它不会抛出 IOException 异常。
//


        //  3. 对象序列化流
        //    序列化：指的就是将内存的数据，存储在硬盘上。
        //    对象序列化流 ObjectOutputStream：  将对象存储到硬盘中
        Student s1 = new Student("s01","张三",18,"河南洛阳");

        // 将ArrayList对象s 永久存储到 硬盘上
        FileOutputStream fs = new FileOutputStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\objs\\stu1",false);
        ObjectOutputStream oos = new ObjectOutputStream(fs);

        // 使用对象序列化流，将对象 al 写入文件，前提是对象 al 的类  实现了 Serializable 接口
        oos.writeObject(s1);
        // 关闭流
        oos.close();
        fs.close();

//        //    对象反序列化流 ObjectInputStream：  将硬盘中存储的对象数据给读取并转换为对象
        FileInputStream fis = new FileInputStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\objs\\stu1");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 假设我们不知道 stus 文件中存储了多少个学生对象，想要全部读取出来。
        Object o = ois.readObject();
        System.out.println(o);

        // 关闭流
        ois.close();
        fis.close();

    }
}

