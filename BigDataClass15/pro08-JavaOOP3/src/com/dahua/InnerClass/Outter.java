package com.dahua.InnerClass;

/**
 * 外部类
 * @author Mr.yu
 * @date 2022/10/28 11:09
 */
public class Outter {

    private int num = 10;

    public void method(){

        int num2 = 999;

        class Inner{
           public int a = num2;
        }

        Inner inner = new Inner();
        System.out.println(inner.a);
    }
//
//    public void method2(){
//        Inner inner = new Inner();
//
//    }

    // 成员内部类，定义在类的内部
    // 局部内部类，定义在方法内部


}
