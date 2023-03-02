package com.dahua.StudentDAO;

/**
 *  此学生类就是对应student数据表所创建的映射类。也叫Bean类
 *   像这样的，类中有一些属性，提供了构造方法，还提供一些Get、Set方法的类，称为 Java Bean类
 *   这种类一般的作用，就是为了在数据库和java程序之间起到承载数据的作用。
 */
public class Student {
    private int s_id;
    private String s_name;
    private String s_sex;
    private double s_score;
    private int s_age;

    public Student() {
    }

    public Student(int s_id, String s_name, String s_sex, double s_score) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_score = s_score;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public double getS_score() {
        return s_score;
    }

    public void setS_score(double s_score) {
        this.s_score = s_score;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_score=" + s_score +
                ", s_age=" + s_age +
                '}';
    }
}
