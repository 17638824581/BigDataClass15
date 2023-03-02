package com.dahua.paramPassing;

public class Person{

    // 在类中定义的类，就是内部类
    // 内部类可以访问外部类的所有成员，包括私有的
    // 头类
    private String name;
    private int age;
    private String sex;


    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
    
    
    /**
     * 自我介绍
     * @param : 
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 9:34
     */
    public void speak(){
        System.out.println("大家好，我是"+name+"，我今年"+age+"岁，我是个"+sex);
    }
    

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
