package com.dahua.method;

public class MethodParameter {

    // 方法参数传递的问题

    public static void change(int a){
        a = 100;
    }

    public static void change(int[] b){
        b[0] = 100;
    }


    public static void main(String[] args) {
        int num = 50;
        System.out.println("在调用change()方法之前，num="+num);
        change(num);
        System.out.println("在调用change()方法之后，num="+num);

        int[] arr = {50};
        System.out.println("在调用change()方法之前，arr[0]="+arr[0]);
        change(arr);
        System.out.println("在调用change()方法之后，arr[0]="+arr[0]);

    }

}
