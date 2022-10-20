package com.xty.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 通过循环，来输入学生信息并创建、存储学生对象
        while (true){
            System.out.println("------- 开始录入 --------");
            System.out.println("请输入第"+(students.size()+1)+"个学生的学号：");
            String id = sc.next();
            System.out.println("请输入第"+(students.size()+1)+"个学生的姓名：");
            String name = sc.next();
            System.out.println("请输入第"+(students.size()+1)+"个学生的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入第"+(students.size()+1)+"个学生的性别：");
            String gender = sc.next();

            // 根据输入的学生信息，创建学生对象
            Student s = new Student(id, name, age, gender);
            System.out.println(s);

            // 将学生对象存储到 arrayList 中
            students.add(s);

            System.out.println("是否继续？（y/n）：");
            String input = sc.next();
            if (input.equals("n") || input.equals("N")){
                System.out.println("-------- 结束录入 ---------");
                break;
            }
        }

        System.out.println("students = " + students);
    }
}
