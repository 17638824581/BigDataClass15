package com.xty.pojo;

public class Teacher {
    private String name;
    private int age;
    private Student likeStu;


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

    public Student getLikeStu() {
        return likeStu;
    }

    public void setLikeStu(Student likeStu) {
        this.likeStu = likeStu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likeStu=" + likeStu +
                '}';
    }
}
