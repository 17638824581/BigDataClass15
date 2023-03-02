package com.dahua.lianXi;

/**
 * 人类
 * @author Mr.yu
 * @date 2022/10/27 16:57
 */
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    /**
     * 吃饭
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 16:59
     */
    public abstract void eat();


}
