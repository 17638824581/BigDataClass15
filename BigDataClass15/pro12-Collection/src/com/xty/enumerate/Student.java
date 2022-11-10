package com.xty.enumerate;

public class Student {
    private String name;

    // 性别只有 男 和 女，没有其他的，所以说如果使用 String 类型表示性别。
    // 就会导致有很大的不确定性。
    private Sex sex;

    public Student() {
    }

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return this.sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
