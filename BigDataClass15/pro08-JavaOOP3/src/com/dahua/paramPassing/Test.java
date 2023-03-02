package com.dahua.paramPassing;

public class Test {

    /**
     * 接收一个人类对象，让他做自我介绍
     * @param : 
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 9:36
     */
    public static void expressionTrainingCourse(Person p){

        System.out.println("------"+p.getName()+"的自我介绍---------");
        p.speak();
    }

    /**
     * 上课方法
     * @param p: 
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 9:51
     */
    public static Teach goToClass (Teach p){
//        p.teaching("数学","语文");
        return p;
    }
    
    /**
     * 改名
     * @param : 
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 10:07
     */
    public static Person rename(Student p,String newName) {
        p.setName(newName);
        return p;
    }

    public static void main(String[] args) {

        // 为了简化使用这个方法的成本
        // 提出了 匿名内部类的概念
        //  这个类没有名字，并且这个类只用这一次。

        // 对匿名内部类再次优化 ——> jdk8 新特性 ： Lambda 表示式

        // 匿名内部类的写法
//        goToClass(new Teach(){
//            @Override
//            public void teaching(String name, String name2) {
//                System.out.println("先教"+name);
//                System.out.println("再教"+name2);
//            }
//        });

        // Lambda 的写法
        // 使用 Lambda 的前提是：该接口或该抽象类中只有一个需要重写的方法。
//        goToClass((name,name2)->{
//            System.out.println("先教"+name);
//            System.out.println("再教"+name2);
//        });
    }
}
