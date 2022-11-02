package com.xty.exception;

import java.text.ParseException;
public class ExceptionTest {

    public static void main(String[] args) throws ParseException {

        // 编译时异常：这个异常我们需要在写代码的过程中就处理掉。
        //  如果我们遇见了编译时异常，我们就需要处理这个异常
        //    1. 使用 try-catch 捕获并处理
        //    2. 不处理，继续抛出这个异常。

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date d = sdf.parse("2020-5-6");
//
//        System.out.println(d);


        // 运行时异常： 一般代表的是代码在运行过程中会出现的异常。
        // 我们可以不处理。

//        System.out.println(10/0);


//        test(0);
        // java 中的异常
//        int[] arr = {1,2,3};
//
//        // java 程序遇到了异常，造成java程序提前结束。
//        System.out.println(arr[3]);
//
//        System.out.println("其它功能。。。");

//        try{
//            int[] arr ={0,0,0,0};
//            System.out.println(arr[4]);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        // try-catch-finally

//        try{
//            System.out.println("可能会出现异常的代码！");
//            System.out.println(10/0);
//        }catch (Exception e){
//            System.out.println("捕获到了异常！");
//        }finally{
//            // finally 中的代码，表示无论出不出错，都要运行的代码。
//            System.out.println("finally中的代码");
//        }

//        System.out.println("异常处理之后的代码");


    }
}
