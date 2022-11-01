package com.xty.common;


import java.util.Arrays;

public class MathTest {
    // 计算圆的面积的方法
    public static double area(double r){
        double area = r*r*Math.PI;

        return area;
    }


    public static void main(String[] args) {

        // Math 类
        // 位于 java.lang 包之下，在lang包之内的所有类，都不需要导包即可使用
//        System.out.println("Math.PI = " + Math.PI);
//        System.out.println("Math.E = " + Math.E);

//        double d = 1.89;

        // Math.ceil()  向上取整
        // Math.floor()  向下取整
        // Math.pow(a,b) 计算a的b次方
        // Math.random() 返回大于等于0小于1的随机的小数
        // Math.rint() 往距离更近的方向取整（double），返回double型
        // Math.round() 四舍五入取证，返回 long 型

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//
        // System.exit() 结束当前JVM虚拟机
        // System.currentTimeMills(); // 截取当前系统时间（UTC时间）格林威治时间，
        // System.arrayCopy();          // 复制数组

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = new int[10];
//
//        System.out.println("拷贝前：");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        System.arraycopy(arr1,0,arr2,7,3);
//
//        System.out.println("拷贝后：");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        // 从 1970年1月1日0时0分0秒0毫秒开始，到现在所过的毫秒数。
        // 1秒 = 1000毫秒
        // 1分 = 60秒
        // 1时 = 60分 = 3600秒
        // 1天 = 24小时 = 14400分
        // 1年 = 365天 = 8760 时

//        long l = System.currentTimeMillis();
//
//
//
//        System.out.println(l);


//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i);
//        }

//        String s1 = "123";
//        String s2 = "123";
//
//        String s3 = new String("123");
//        String s4 = new String("123");
//
//        System.out.println(s3==s4);
//
//        System.out.println("s1.hashCode() = " + s1.hashCode());
//        System.out.println("s2.hashCode() = " + s2.hashCode());
//
//        System.out.println("s3.hashCode() = " + s3.hashCode());
//        System.out.println("s4.hashCode() = " + s4.hashCode());


        int[] arr1 = {25,32,48,95,65,15,32,30};
//        int[] arr2 = {25,32,48,95,65,15,32,30};
//
//        int[] arr3 = new int[100];
//        Arrays.fill(arr3, 5);

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));



//        System.out.println("排序前");
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length-i-1 ; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        System.out.println("排序后");
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//        int i = Arrays.binarySearch(arr, 50);

//        System.out.println("元素48在arr中的索引是："+i);

    }
}
