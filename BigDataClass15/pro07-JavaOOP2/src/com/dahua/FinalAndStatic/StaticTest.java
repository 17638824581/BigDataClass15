package com.dahua.FinalAndStatic;

public class StaticTest {

    // 非静态代码块，会在每次创建对象的时候运行，但是它的运行顺序比 构造方法 更高。
    // 如果你希望某些代码在你创建对象的时候 且 在 构造方法之前运行。
//    {
//        System.out.println("我是个代码块！");
//    }

    // 静态代码块，会在首次访问这个类的时候，运行一次。之后再使用这个类就不会运行了。
//    static {
//        System.out.println("静态代码块运行了！");
//    }

    public StaticTest(){
        System.out.println("空参构造运行了！");
    }

    // 不加static就是成员变量，需要通过对象访问
    public final static String name = "小明";

    public static void speak(){
        System.out.println("123123");
    }


    public static void main(String[] args) {
        System.out.println("StaticTest.name = " + StaticTest.name);


        // static 修饰符
        // 1. 修饰成员变量
        //  当 static 修饰成员变量时，成员变量就变成了 静态成员变量。属于 类 的，可以直接通过 类名.属性名 进行访问。
        //  所有的该类对象也共享这个静态成员变量，如果静态成员变量被修改，所有的对象访问时是属性值也会更改。
        // 2. 修饰成员方法
        //  当 static 修饰成员方法时，成员方法就会变为 静态成员方法。可以直接通过 类名.方法名() 的方式来 进行调用。
        //  所有的该类对象也共享这个静态成员方法。
        // 3. 修饰 代码块
        //  当 static 修饰代码块时，该代码块就会变成 静态代码块。静态代码块会在类首次被访问时调用一次。

        // final 修饰符
        // 1. 修饰变量
        //  当 final 修饰变量时，该变量就会被视为常量（不可更改的）
        // 2. 修饰方法
        //  当 final 修饰方法时，该方法就会被视为 最终方法（不可被 重写）
        // 3. 修饰类
        //  当 fianl 修饰类时，该类就会被视为最终类（不可被继承）
    }
}
