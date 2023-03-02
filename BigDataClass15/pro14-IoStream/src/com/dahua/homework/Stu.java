package com.dahua.homework;

import java.util.Objects;

public class Stu {
    private String name;
    private double ChineseScore;
    private double MathScore;
    private double EnglishScore;

    public Stu() {
    }

    public Stu(String name, double chineseScore, double mathScore, double englishScore) {
        this.name = name;
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
        Stu stu = (Stu) o;
        return Double.compare(stu.ChineseScore, ChineseScore) == 0 && Double.compare(stu.MathScore, MathScore) == 0 && Double.compare(stu.EnglishScore, EnglishScore) == 0 && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ChineseScore, MathScore, EnglishScore);
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", ChineseScore=" + ChineseScore +
                ", MathScore=" + MathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }
}
