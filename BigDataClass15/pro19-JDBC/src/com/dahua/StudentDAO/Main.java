package com.dahua.StudentDAO;

import java.util.List;
import java.util.Scanner;

public class Main {

    // 全局静态变量
    private static StudentDao sd = new StudentDao();
    private static Scanner sc = new Scanner(System.in);


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

    // 查询学生信息的方法
    public static void queryStu(){
        System.out.println("a.根据学号查询");
        System.out.println("b.根据姓名查询");
        System.out.println("请输入选项：");
        String next1 = sc.next();
        if (next1.equals("a") || next1.equals("A")){
            System.out.println("请输入学号：");
            int id = sc.nextInt();
            Student s = sd.getById(id);
            if (s == null){
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
        }
    }

    // 添加学生信息的方法
    public static void addStu(){
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的性别：");
        String sex = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的分数：");
        double score = sc.nextDouble();
        // 调用 StudentDao 类的方法，来添加一条学生信息
        boolean b1 = sd.addStudent(name, sex, score, age);
        if (b1){
            System.out.println("学生信息添加完成！");
        }else{
            System.out.println("学生信息添加失败！");
        }
    }

    // 修改学生信息的方法
    public static void updateStu(){
        System.out.println("请输入您要修改的学生的学号：");
        int id2 = sc.nextInt();
        // 判断这个学生是否存在？ 可以通过 StudentDao 类的 getById() 方法先查找这个学号的学生
        Student s = sd.getById(id2);

        if (s == null){
            System.out.println("您要修改的学生信息不存在！");
        }else{
            // 在让用户修改学生信息之前，打印一下这个学生当前的信息
            System.out.println("学号为"+id2+"的学生信息为：");
            printStudent(s);
            B:while (true) {
                System.out.println("1.修改姓名");
                System.out.println("2.修改性别");
                System.out.println("3.修改年龄");
                System.out.println("4.修改分数");
                System.out.println("5.保存修改");
                System.out.println("6.取消修改");

                System.out.println("请输入您要修改的选项：");
                int item = sc.nextInt();

                switch (item){
                    case 1:
                        // 修改姓名
                        System.out.println("请输入新的姓名：");
                        String next2 = sc.next();
                        s.setS_name(next2);
                        System.out.println("姓名修改完成！");
                        printStudent(s);
                        break;
                    case 2:
                        // 修改性别
                        System.out.println("请输入新的性别：");
                        String next3 = sc.next();
                        s.setS_sex(next3);
                        System.out.println("性别修改完成！");
                        printStudent(s);
                        break ;
                    case 3:
                        // 修改年龄
                        System.out.println("请输入新的年龄：");
                        int new_age = sc.nextInt();
                        s.setS_age(new_age);
                        System.out.println("年龄修改完成！");
                        printStudent(s);
                        break ;
                    case 4:
                        // 修改分数
                        System.out.println("请输入新的分数：");
                        double new_score = sc.nextDouble();
                        s.setS_score(new_score);
                        System.out.println("分数修改完成！");
                        printStudent(s);
                        break ;
                    case 5:
                        // 保存修改
                        // 真正的将用户对学生对象所作的修改，保存到数据库中
                        boolean b = sd.updateStudent(id2, s);
                        if (b){
                            System.out.println("学生信息修改已保存！");
                            break B;
                        }else{
                            System.out.println("学生信息修改保存失败！");
                            break B;
                        }
                    case 6:
                        // 取消修改
                        System.out.println("已撤销修改！");
                        break B;
                    default:
                        System.out.println("请输入正确选项！");
                        break ;
                }
            }
        }
    }

    // 删除学生信息的业务方法
    public static void deleteStu(){
        System.out.println("请输入您要删除的学生的学号：");
        int id = sc.nextInt();
        boolean b = sd.deleteById(id);
        if (b){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }


    public static void main(String[] args) {
        // 初始化数据库连接池
        try {
            Class.forName("com.dahua.StudentDAO.JdbcUtils");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 学生管理系统，业务程序
        A:while (true){
            System.out.println("欢迎使用学生管理系统！");
            System.out.println("1.查询学生");
            System.out.println("2.查询全部学生");
            System.out.println("3.添加学生");
            System.out.println("4.修改学生");
            System.out.println("5.删除学生");
            System.out.println("6.退出系统");

            System.out.println("请输入序号：");
            int next = sc.nextInt();

            switch (next){
                case 1:
                    // 查询学生信息：
                    queryStu();
                    break ;
                case 2:
                    // 查询全部学生
                    List<Student> all = sd.getAll();
                    // 打印学生信息
                    printStudent(all);
                    break;
                case 3:
                    // 添加学生信息
                    addStu();
                    break;
                case 4:
                    // 修改学生信息
                    updateStu();
                    break;
                case 5:
                    // 删除学生信息
                    deleteStu();
                    break;
                case 6:
                    // 退出
                    System.out.println("拜拜~");
                    break A;
                default:
                    System.out.println("请输入正确的序号！");
            }
        }


    }
}
