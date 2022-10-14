package com.dahua.homework;

public class KuoHao {

    // 判断字符串中的括号是否有效
    public static boolean isValid(String str){

        StringBuffer sb = new StringBuffer(str);
        int num = sb.length() / 2;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < sb.length()-1; j++) {
                // 获取两个字符
                char c = sb.charAt(j);
                char c1 = sb.charAt(j + 1);
                // 判断 c 和 c1 是不是相同类型的左右括号
                if (c == '{' && c1 == '}' || c=='[' && c1==']' || c=='(' && c1 == ')'){
                    // 只要找到了,就删掉这两个字符
                    sb.delete(j, j + 2);
                }
            }
        }

        return sb.length() == 0;
    }

    public static void main(String[] args) {
        // 阔号匹配问题

        String s = "[(])";

        boolean valid = isValid(s);

        System.out.println(valid);


    }
}
