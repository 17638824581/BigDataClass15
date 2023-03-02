package com.dahua.homework;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
//        // 1.排序人名
//        //1. 读取名单文件
//        FileReader fr = new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\stu.txt");
//        BufferedReader br = new BufferedReader(fr);
//        //2. 将每个人名读取为一个字符串，存到 ArrayList 中
//        ArrayList<String> names = new ArrayList<>();
//        String name;
//        while ((name = br.readLine()) != null){
//            name = name.trim();
//            if (!name.equals("")) names.add(name);
//        }
//
//        System.out.println("排序之前 names = " + names);
//
//        //3. 然后对每个人名进行排序（按姓氏的编码）
//        names.sort((o1,o2)->{
//            char c1 = o1.charAt(0);
//            char c2 = o2.charAt(0);
//            return c1-c2;
//        });
//
//        System.out.println("排序之后 names = " + names);
//
//        //4. 再将排序好的人名使用 BGK 编码写入到新的文件 sutdents.txt 中
//        FileWriter fw = new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\students.txt", Charset.forName("GBK"),true);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        for (String s : names) {
//            bw.write(s);
//            bw.newLine();
//        }
//
//        // 关闭流
//        br.close();
//        fr.close();
//        bw.close();
//        fw.close();




        //2.随机点名
        // 2.1 读取上题排序好的名单数据
        FileReader fr = new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\students.txt",Charset.forName("GBK"));
        BufferedReader br = new BufferedReader(fr);
        
        // 2.2 将人名存到 ArrayList 中
        ArrayList<String> al = new ArrayList<>();
        String name;
        while ((name=br.readLine()) != null){
            if (name.equals(""))continue;
            al.add(name);
        }

        // 2.3 打乱其中的人名
        Collections.shuffle(al);

        // 2.4 通过随机数，获取随机的索引，打印这个索引所在的人名。
        int index = new Random().nextInt(al.size());
        System.out.println("点到的人名是："+al.get(index));

        br.close();
        fr.close();

    }
}
