package com.wrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        // 基本数据类型       包装类
        //  int 整形    ——>  Integer
        //  short 短整型 ——>  Short
        //  byte  字节型 ——>  Byte
        //  long 长整型  ——>  Long
        //  float  浮点型 ——> Float
        //  double  双浮点型  Double
        //  char   字符型     Character
        //  boolean  布尔型   Boolean


        // 自动装箱和自动拆箱
        // 自动装箱，指的是基本数据类型可以自动的转为 它所对应的包装类型
//        Integer i = 100;

        // 自动拆箱，指的是包装类型对象，可以自动转为对应的 基本类型
//        int j = Integer.valueOf("123");



        // ArrayList 列表 只能存 引用数据类型
        //  基本数据类型 ---> 引用数据类型
        //  包装类：对基本数据类型进行包装，使其变为引用数据类型。

/*        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);*/


        // 包装类；数据类型转换
        // 各种基本数据类型 <---> 字符串

//        String s = "True";
//        int i = Integer.parseInt(s);
//        double v = Double.parseDouble(s);
//        float v1 = Float.parseFloat(s);
//        boolean b = Boolean.parseBoolean(s)
//        System.out.println(b);


        // Integer类，是对 int 型数据的包装类

//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


        // 直接创建对象
//        Integer j = new Integer("888");

        // 间接获取对象（工厂方法）
//        Integer k = Integer.valueOf("888");
//        System.out.println(i*k);

        // Integer: int 型的包装类
        //  parseInt(String str) : 将字符串 str 转为 int 类型
        //  toString()： 将本 integer 对象 转为 字符串返回
        //  static toString(int i)： 将 i 转为 字符串返回

        // Double: double 型的包装类象
        //  parseDouble(String str) : 将字符串 str 转为 double 类型
        //  toString()： 将本 Double 对象 转为 字符串返回
        //  static toString(double d)： 将 d 转为 字符串返回

        // Long: long 型的包装类
        //  parseLong(String str) : 将字符串 str 转为 long 类型
        //  toString()： 将本 integer 对象 转为 字符串返回
        //  static toString(int i)： 将 i 转为 字符串返回

        // Float: float 型的包装类
        //  parseFloat(String str) : 将字符串 str 转为 float 类型
        //  toString()： 将本 Float 对象 转为 字符串返回
        //  static toString(float f)： 将 f 转为 字符串返回

        // 整数 ---> 字符串
//        int i = 110;
//        String s = ""+i;// +空字符串，效率低
//        String s1 = Integer.toString(i); // 通过Integer 转换为 String，快
//        System.out.println(s1);


        // 练习：将 字符串 "15 95 66 84 6 1 95 6 65 48 52 15"
        // 拆分并排序，最后按原格式打印出来
        // 1. 拆分 String.split()
        // 2. 排序 Arrays.sort()
        // 3. 拼接 StringBuilder
        // 3. 打印
//        String s = "15 95 66 84 6 1 95 6 65 48 52 15";



//        System.out.println(Arrays.toString(s1));

    }
}
