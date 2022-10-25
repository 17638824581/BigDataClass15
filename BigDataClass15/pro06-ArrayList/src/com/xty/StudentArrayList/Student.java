package com.xty.StudentArrayList;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String gender;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    // 手动写 equals() 方法，方法的作用是比较 本对象和 另一个Student 对象内容是否一致。
    public boolean equals(Student s) {
        //1.判断两个对象的内存地址
        if (s == this){
            return true;
        }
        //2.判断传进来的对象是否为空
        if (s == null){
            return false;
        }
        //3.判断两个对象的各个属性是否一致
        return this.name.equals(s.getName()) && this.age == s.getAge() && this.gender.equals(s.getGender()) && this.id.equals(s.getId());
    }
}
