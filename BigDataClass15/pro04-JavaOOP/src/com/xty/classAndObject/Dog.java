package com.xty.classAndObject;

// 狗类，
// 狗的属性：名字、年龄、性别、毛色、品种
// 狗的方法：会叫，会吃，会跑
public class Dog {

    // 属性就是定义在类中的变量
    // 名字属性
    private String name;
    // 年龄属性
    private int age;
    // 性别属性
    private String sex;
    // 毛色属性
    private String color;
    // 品种属性
    private String breed;

    // 构造方法（在创建对象时，要用到的方法）
    // 希望对象属性有初始值。

    // 当类中没有定义构造方法时，这个类自带一个 无参构造

    // 当类中定义了构造方法，就必须按照构造方法创建对象

    public Dog(){
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Dog(String name, int age, String sex, String color) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
    }

    public Dog(String name, int age, String sex, String color, String breed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // 方法，代表类能干什么？
    // 吃东西的方法
    public void eat(String food){
        System.out.println(name+"吃了"+food);
        // 吃饱了拉
        this.shit();
    }

    // 叫的方法
    public void cry(){
        System.out.println(name+"叫了：汪汪汪！");
    }

    public void run(){
        System.out.println(name+"跑了~");
    }

    // 拉屎的方法
    private void shit(){
        System.out.println(this.name+"上了个厕所！");
    }

}
