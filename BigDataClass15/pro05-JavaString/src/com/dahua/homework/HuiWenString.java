package com.dahua.homework;

/*
 * 判断字符串是否是回文串：顺序读和反序读都一样的字符串。
 * @author Mr.yu
 * @date 2022/10/17 11:30
 */
public class HuiWenString {

    public static void main(String[] args) {

        String s = "123oiASDjasd94ASD2o0 023 haofASD ,.231390 /.";

        StringBuilder sb = new StringBuilder();

        // 只保留字母和数字，字母还要转小写
        for (int i = 0; i < s.length(); i++) {
            // 判断当前遍历的字符是不是字母或数字
            char c = s.charAt(i);
            if (c >= 65 && c <= 65 + 25) {
                c += 32;
                sb.append(c);
            } else if (c >= 48 && c <= 57 || c >= 97 && c <= 97 + 25) {
                sb.append(c);
            }
        }

        String str1 = sb.toString();
        String str2 = sb.reverse().toString();

        if (str1.equals(str2)){
            System.out.println(sb+"是回文串");
        }else{
            System.out.println(sb+"不是回文串");
        }


    }
}
