package com.dahua.homework;

public class T1 {

    // 打印指定数组内容的方法
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            // 判断是否是最后一个元素
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }


    // 将数组转为字符串并返回
    public static String toString(int[] arr){
        String s = "[";
        for (int a = 0; a < arr.length; a++) {
            if(a == arr.length-1){
                s += arr[a];
            }else{
                s += arr[a] + ", ";
            }
        }
        s += "]";

        return s;
    }

    // 获取整形数组中的最大元素，并返回
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    // 计算整形数组中所有元素的平均值，并返回
    public static double getAvg(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    // 找出两个小数中最小的那个并返回
    public static double getMin(double a, double b){
        if (a>b){
            return b;
        }else {
            return a;
        }
    }

    // 找出三个整数中最大的那个值并返回
    public static int getMax(int a, int b, int c){
        int max = a;

        if (a>=b && a>=c){
            max = a;
        }else if(b>=a && b>=c){
            max = b;
        }else if(c>=a && c>=b){
            max = c;
        }

        return max;
    }


    // 按照第一位小数进行四舍五入，返回整数结果
    public static int round(double n){
        // a 表示n的第一位小数值
        int a = ((int) (n * 10)) % 10;

        if (a>=5){
            return (int)n + 1;
        }else{
            return (int)n;
        }
    }

    // 计算 a 的 b 次方，要求 b > 0,
    public static int power(int a, int b){

        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }


    public static void main(String[] args) {


//        double d = 1.234560789;



        // 遍历数组打印内容

//        int[] arr1 = {1,2,3,4,5,6};
//
//        int max = getMax(arr1);
//        System.out.println("arr1数组中的最大值为："+max);
//
//        double avg = getAvg(arr1);
//        System.out.println("arr1数组中所有元素的平均值："+avg);


    }
}
