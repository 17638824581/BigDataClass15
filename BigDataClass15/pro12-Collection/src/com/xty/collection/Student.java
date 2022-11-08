package com.xty.collection;

import java.util.Objects;

public class Student{
    private String name;
    private int age;
    private double ChineseScore;
    private double MathScore;
    private double EnglishScore;

    public Student() {
    }

    public Student(String name, int age, double chineseScore) {
        this.name = name;
        this.age = age;
        ChineseScore = chineseScore;
    }

    public Student(String name, int age, double chineseScore, double mathScore, double englishScore) {
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ChineseScore=" + ChineseScore +
                ", MathScore=" + MathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.ChineseScore, ChineseScore) == 0 && Double.compare(student.MathScore, MathScore) == 0 && Double.compare(student.EnglishScore, EnglishScore) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ChineseScore, MathScore, EnglishScore);
    }
}
