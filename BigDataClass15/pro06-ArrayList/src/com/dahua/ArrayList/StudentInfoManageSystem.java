package com.dahua.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoManageSystem {

    /*
     * 删除 al 中的 学号为 id 的学生
     * @param id: 要删除的学生的id
     * @param al: 存储学生对象的 ArrayList
     * @return boolean: 返回是否删除成功，如果返回 true，代表删除成功
     * @author Mr.yu
     * @date 2022/10/21 9:53
     */
    public static boolean deleteStudentById(String id, ArrayList<Student> al){
        for (int i = 0; i < al.size(); i++) {
            Student student = al.get(i);
            if (student.getId().equals(id)){
                al.remove(student);
                return true;
            }
        }
        return false;
    }
    
    /*
     * 执行删除学生的功能
     * @param students: 代表要删除 students中的学生
     * @return void
     * @author Mr.yu
     * @date 2022/10/21 10:03
     */
    public static void deleteStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要删除学生的学号:");
        String id = scanner.next();
        boolean b = deleteStudentById(id, students);
        if (b){
            System.out.println("删除成功！");
        }else{
            System.out.println("未找到这个学生！");
        }
    }
    
    /*
     * 根据学生id获取学生对象
     * @param id: 要查找的学生id
	 * @param al: 存储了学生对象的列表
     * @return Student: 如果找到学生，就返回该学生对象，否则返回 null
     * @author Mr.yu
     * @date 2022/10/21 10:42
     */
    public static Student getStudntById(String id , ArrayList<Student> al){
        for (Student s:al) {
            if (s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    
    /*
     * 查询学生信息的功能方法。
     * @param students: 代表存储了学生信息的集合，本方法查询这个集合中的学生信息
     * @return void
     * @author Mr.yu
     * @date 2022/10/21 10:41
     */
    public static void showStudnet(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.查询学号");
        System.out.println("2.查询全部");
        System.out.println("请输入查询的功能序号：");
        int i = scanner.nextInt();
        if (i==1){
            System.out.println("---------根据学号查询学生---------");
            System.out.println("请输入学号：");
            String id = scanner.next();
            Student s = getStudntById(id, students);
            if (s == null){
                System.out.println("无此学生！");
            }else{
                System.out.println("学号\t|\t姓名\t|\t年龄\t|\t性别");
                System.out.println(s.getId()+"\t|\t"+s.getName()+"\t|\t"+s.getAge()+"\t|\t"+s.getGender());
            }
        }else{
            System.out.println("---------查询全部学生---------");
            System.out.println("学号\t|\t姓名\t|\t年龄\t|\t性别");
            for (Student s:students) {
                System.out.println(s.getId()+"\t|\t"+s.getName()+"\t|\t"+s.getAge()+"\t|\t"+s.getGender());
            }
        }
    }



    // 录入学生信息的方法
    // 通过键盘录入学生信息
    // 将录入的信息 存到 al 中
    public static void inputStudents(ArrayList<Student> al){
        Scanner sc = new Scanner(System.in);

        // 通过循环，来输入学生信息并创建、存储学生对象
        while (true){
            System.out.println("------- 开始录入 --------");

            // 处理学号重复问题
            Student s;
            String id;
            while (true) {
                System.out.println("请输入第" + (al.size() + 1) + "个学生的学号：");
                id = sc.next();
                // 判断学号是不是已存在
                s = getStudntById(id, al);
                if (s != null) {
                    System.out.println("学号重复，请重新输入！");
                }else{
                    break;
                }
                // 如果已存在，请重新输入
            }

            System.out.println("请输入第"+(al.size()+1)+"个学生的姓名：");
            String name = sc.next();
            System.out.println("请输入第"+(al.size()+1)+"个学生的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入第"+(al.size()+1)+"个学生的性别：");
            String gender = sc.next();

            // 根据输入的学生信息，创建学生对象
            s = new Student(id, name, age, gender);
            System.out.println(s);

            // 将学生对象存储到 al 中
            al.add(s);

            System.out.println("是否继续？（y/n）：");
            String input = sc.next();
            if (input.equals("n") || input.equals("N")){
                System.out.println("-------- 结束录入 ---------");
                return;
            }
        }
    }


    // 修改学生信息
    public static void updateStudnt(ArrayList<Student> al){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String id = scanner.next();
        // 判断此学号是否存在
        Student s = getStudntById(id,al);
        if (s==null){
            System.out.println("查无此人！");
        }else{
            System.out.println(s);

            Student newStudent = new Student(s.getId(),s.getName(),s.getAge(),s.getGender());

            A:while (true){
                System.out.println("1. 修改姓名");
                System.out.println("2. 修改年龄");
                System.out.println("3. 修改性别");
                System.out.println("4. 保存修改");
                System.out.println("5. 取消修改");
                System.out.println("请输入序号：");
                int i = scanner.nextInt();
                switch (i){
                    case 1:
                        System.out.println("请输入新姓名：");
                        String newname = scanner.next();
                        newStudent.setName(newname);
                        break;
                    case 2:
                        System.out.println("请输入新年龄：");
                        int newage = scanner.nextInt();
                        newStudent.setAge(newage);
                        break;
                    case 3:
                        System.out.println("请输入新性别：");
                        String newGender = scanner.next();
                        newStudent.setGender(newGender);
                        break;
                    case 4:
                        System.out.println("保存修改：");
                        // 将 ArrayList 中的 s 替换为 newStudnet
                        // 使用 ArrayList 中的 set() 方法，将 s 改为 newStudent
                        int index = al.indexOf(s);
                        al.set(index,newStudent);
                        break A;
                    case 5:
                        System.out.println("取消修改~");
                        break A;
                }
            }
        }
    }


    public static void main(String[] args) {
        // 所有的信息都存到 students 中。
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        A:while (true){
            System.out.println("-------欢迎使用学生信息管理系统--------");
            System.out.println("1. 录入学生信息");
            System.out.println("2. 查询学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 删除学生信息");
            System.out.println("5. 退出系统");

            System.out.println("请输入序号：");
            int i = scanner.nextInt();

            switch (i){
                case 1:
                    System.out.println("--------录入学生信息---------");
                    inputStudents(students);
                    break;
                case 2:
                    System.out.println("--------查询学生信息---------");
                    showStudnet(students);
                    break;
                case 3:
                    System.out.println("--------修改学生信息---------");
                    updateStudnt(students);
                    break;
                case 4:
                    System.out.println("--------删除学生信息---------");
                    deleteStudent(students);
                    break;
                case 5:
                    System.out.println("bye~");
                    break A;
            }
        }
    }
}
