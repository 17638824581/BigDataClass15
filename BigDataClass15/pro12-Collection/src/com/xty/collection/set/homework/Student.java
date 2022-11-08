package com.xty.collection.set.homework;

import java.util.Objects;

public class Student {
    private String name;    // 学生姓名
    private int age;        // 学生年龄
    private String sex;     // 学生性别
    private String phone;   // 学生手机号
    private String banji;   // 学生的班级
    private double ChineseScore;    // 学生语文成绩
    private double MathScore;       // 学生数学成绩
    private double EnglishScore;    // 学生英语成绩

    public Student() {
    }

    public Student(String name, int age, String sex, String phone, String banji, double chineseScore, double mathScore, double englishScore) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.banji = banji;
        ChineseScore = chineseScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public double getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(double chineseScore) {
        ChineseScore = chineseScore;
    }

    public double getMathScore() {
        return MathScore;
    }

    public void setMathScore(double mathScore) {
        MathScore = mathScore;
    }

    public double getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(double englishScore) {
        EnglishScore = englishScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.ChineseScore, ChineseScore) == 0 && Double.compare(student.MathScore, MathScore) == 0 && Double.compare(student.EnglishScore, EnglishScore) == 0 && Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(phone, student.phone) && Objects.equals(banji, student.banji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, phone, banji, ChineseScore, MathScore, EnglishScore);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", banji='" + banji + '\'' +
                ", ChineseScore=" + ChineseScore +
                ", MathScore=" + MathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }
}
