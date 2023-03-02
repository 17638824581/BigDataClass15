package com.dahua.homework;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
       /* // 1. 将 ArrayList 中的学生信息存储到 指定文件中。
        Student s1 = new Student("s01", "小红", 18, "河南省南阳市");
        Student s2 = new Student("s02", "小黄", 18, "河南省洛阳市");
        Student s3 = new Student("s03", "小橙", 18, "河南省郑州市");
        Student s4 = new Student("s04", "小绿", 18, "河南省三门峡市");
        Student s5 = new Student("s05", "小青", 18, "河南省平顶山市");
        Student s6 = new Student("s06", "小蓝", 18, "河南省信阳市");
        Student s7 = new Student("s07", "小紫", 18, "河南省周口市");
        Student s8 = new Student("s08", "小白", 18, "河南省驻马店市");
        Student s9 = new Student("s09", "小黑", 18, "河南省焦作市");
        Student s10 = new Student("s10", "小金", 18, "河南省安阳市");
        Student s11 = new Student("s11", "小银", 18, "河南省开封市");
        Student s12 = new Student("s12", "小铝", 18, "河南省商丘市");
        Student s13 = new Student("s13", "小铁", 18, "河南省濮阳市");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        al.add(s7);
        al.add(s8);
        al.add(s9);
        al.add(s10);
        al.add(s11);
        al.add(s12);
        al.add(s13);

        // 创建字符输出流
        FileWriter fw = new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\allStudents.txt", Charset.forName("UTF-8"),true);
        BufferedWriter bw = new BufferedWriter(fw);

        // 遍历学生对象所在的集合，将学生对象的信息存储到文件中
        for (Student s : al) {
            bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getLocation());
            bw.newLine();
            // 每写入一个学生信息就刷入一次
            bw.flush();
        }

        // 关闭流
        bw.close();
        fw.close();*/


        // 2. 将文件中存储的学生信息读取出来，并创建学生对象，将所有学生对象存储到 ArrayList中

        // 2.1 使用字符输入流读取文件中的学生信息


//        FileReader fr = new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\allStudents.txt",Charset.forName("UTF-8"));
//        BufferedReader br = new BufferedReader(fr);
//
//        ArrayList<Student> al = new ArrayList<>();
//        // 2.2 读取每一行，对一行中学生信息进行解析
//        String stu;
//        while ((stu = br.readLine()) != null){
//            if (stu.equals("")) continue;
//            String[] split = stu.split(",");
//            // 2.3 通过解析到的属性值，重构学生对象
//            Student s = new Student(split[0],split[1],Integer.parseInt(split[2]),split[3]);
//            // 2.4 将对象存储到 ArrayList中
//            al.add(s);
//        }
//
//        br.close();
//        fr.close();
//
//
//        System.out.println("读取到的学生信息："+al);



    }
}
