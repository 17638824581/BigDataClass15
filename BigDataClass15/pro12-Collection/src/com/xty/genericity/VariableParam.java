package com.xty.genericity;

import java.util.Arrays;
import java.util.List;

public class VariableParam {

    //可变参数：指的是方法接收参数时，可以接收任意个相同类型的参数值

    public static int add(int... a){
        // a 就会变为 int 型的数组,数组中的元素就是调用方法时传入的实参。
        int sum = 0;

        for (int i : a) {
            sum+=i;
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(10, 20, 30, 50, 40, 60);

        System.out.println(l);

    }
}
