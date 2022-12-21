package com.xty.StudentDAO;

import com.xty.JDBCTest.JdbcUtils;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {


    // 格式化打印学生信息
    public static void printStudent(List<Student> list){
        System.out.println("==================== 学生信息 ======================");
        System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t分数");
        list.forEach((s)->{
            System.out.println(s.getS_id()+"\t\t"+s.getS_name()+"\t\t"+s.getS_sex()+"\t\t"+s.getS_age()+"\t\t"+s.getS_score());
        });
        System.out.println("===================== end ======================");
    }

    public static void printStudent(Student s){
        System.out.println("==================== 学生信息 ======================");
        System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t分数");
        System.out.println(s.getS_id()+"\t\t"+s.getS_name()+"\t\t"+s.getS_sex()+"\t\t"+s.getS_age()+"\t\t"+s.getS_score());
        System.out.println("===================== end ======================");
    }

    public static void main(String[] args) {
        // 学生管理系统，业务程序

        StudentDao sd = new StudentDao();

        A:while (true){
            System.out.println("欢迎使用学生管理系统！");
            System.out.println("1.查询学生");
            System.out.println("2.查询全部学生");
            System.out.println("3.添加学生");
            System.out.println("4.修改学生");
            System.out.println("5.删除学生");
            System.out.println("6.退出系统");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入序号：");
            int next = sc.nextInt();

            switch (next){
                case 1:
                    // 查询学生信息：
                    System.out.println("a.根据学号查询");
                    System.out.println("b.根据姓名查询");
                    System.out.println("请输入选项：");
                    String next1 = sc.next();
                    if (next1.equals("a") || next1.equals("A")){
                        System.out.println("请输入学号：");
                        int id = sc.nextInt();
                        Student s = sd.getById(id);
                        if (s.getS_id() == 0){
                            System.out.println("没有这个学生！");
                        }else{
                            printStudent(s);
                        }
                    }else if(next1.equals("b") || next1.equals("B")){
                        System.out.println("请输入姓名：");
                        String name = sc.next();
                        List<Student> allByName = sd.getAllByName(name);
                        if (allByName.size()==0){
                            System.out.println("没有这个学生！");
                        }else{
                            printStudent(allByName);
                        }
                    }else{
                        System.out.println("您输入的选项不正确！");
                        break;
                    }
                    break ;
                case 2:
                    // 查询全部学生
                    List<Student> all = sd.getAll();
                    // 打印学生信息
                    printStudent(all);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("请输入您要删除的学生的学号：");
                    int id = sc.nextInt();
                    boolean b = sd.deleteById(id);
                    if (b){
                        System.out.println("删除成功！");
                    }else{
                        System.out.println("删除失败！");
                    }
                    break;
                case 6:
                    System.out.println("拜拜~");
                    break A;
                default:
                    System.out.println("请输入正确的序号！");
            }
        }


    }
}
