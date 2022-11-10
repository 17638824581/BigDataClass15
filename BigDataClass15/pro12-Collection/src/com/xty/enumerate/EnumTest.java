package com.xty.enumerate;

import java.util.Calendar;

/**
 * 对枚举的测试
 * @author Mr.yu
 * @date 2022/11/9 22:32
 */
public class EnumTest {
    public static void showColor(Color color){
        System.out.println(color);
    }

    public static void main(String[] args) {
        Color b = Color.BlUE;
        Color g = Color.GREEN;

        int i = b.compareTo(g);
        System.out.println(i);

    }
}
