package com.xty.otherStream;
// 一个简单的学生管理系统，
// 通过对象序列化流，来存储学生信息

import com.xty.homework.Stu;
import com.xty.homework.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class NSMS {

    // 存储学生信息的容器
    private ArrayList<Student> data;

    public NSMS() {
        data = new ArrayList<>();
    }

    // 使用指定位置的学生序列化文件，来创建学生管理系统
    public NSMS(File f) throws IOException, ClassNotFoundException {
        // 通过反序列化读取之前的学生信息
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();

        data = (ArrayList<Student>) o;
    }


    // 存储学生
    public void addStudent(Student s){
        data.add(s);
    }

    // 查看所有学生
    public void showAllSutdents(){
        System.out.println("学生学号\t学生姓名\t学生年龄\t学生地址");
        for (Student s : data) {
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getLocation());
        }
    }

    // 删除学生
    public void deleteStudent(String id){
        data = (ArrayList<Student>) data.stream().filter((s)-> !s.getId().equals(id)).collect(Collectors.toList());
    }

    // 将学生信息保存至指定位置
    public void save(File f) throws IOException {
        // 使用对象序列化
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 将 data 存储起来
        oos.writeObject(data);

        // 关闭流
        oos.close();
        fos.close();
    }

}
