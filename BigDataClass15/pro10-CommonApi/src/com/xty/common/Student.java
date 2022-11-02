package com.xty.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student{
    private String name;
    private int age;
    private double score;

    private Date birthday;

    public Student() {
    }

    public Student(String name, double score, String time) throws ParseException {
        this.name = name;
        this.score = score;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(time);
        this.birthday = d;
        // 推算出学生年龄
        int year = d.getYear();
        int year1 = new Date().getYear();
        this.age = year1-year;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

}
