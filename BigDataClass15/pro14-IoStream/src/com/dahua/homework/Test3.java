package com.dahua.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 使用键盘输入5个学生的信息（姓名、语文成绩、数学成绩、英语成绩）

        TreeSet<Stu> stus = new TreeSet<>(Test3::StuCompare);

        Scanner sc = new Scanner(System.in);

        // 使用 TreeSet 存储学生并排序
        for (int i = 0; i < 5; i++) {
            System.out.println("输入学生姓名：");
            String name = sc.next();
            System.out.println("输入学生语文成绩：");
            double cscore = sc.nextDouble();
            System.out.println("输入学生数学成绩：");
            double mscore = sc.nextDouble();
            System.out.println("输入学生英语成绩：");
            double escore = sc.nextDouble();

            // 通过输入的学生信息，创建学生对象
            // 保存学生对象->TreeSet
            stus.add(new Stu(name,cscore,mscore,escore));
        }

        // 遍历 TreeSet 将学生信息写入到文件中。
        FileWriter fw = new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output\\stus.txt", Charset.forName("utf-8"),true);
        BufferedWriter bw = new BufferedWriter(fw);

        try(fw; bw){
            for (Stu stu : stus) {
                bw.write(stu.getName()+","+stu.getChineseScore()+","+stu.getMathScore()+","+stu.getEnglishScore());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    // 这个方法用于比较两个学生的大小，
    // 若返回 负数，则表示 s1 小。
    // 若返回 正数，则表示 s2 小。
    public static int StuCompare(Stu s1, Stu s2){
        double s1sum = s1.getChineseScore() + s1.getMathScore() + s1.getEnglishScore();
        double s2sum = s2.getChineseScore() + s2.getMathScore() + s2.getEnglishScore();

        return s1sum - s2sum > 0 ? -1 : 1;
    }
}
