package com.dahua.homework;

public class LianXiTi {

    /*
     * 判断字符串是否为符合条件的网址
     * @param str: 要判断的字符串
     * @return boolean : 返回 true 代表符合条件
     * @author Mr.yu
     * @date 2022/10/17 10:01
     */
    public static boolean isWebsite(String str){
        return str.startsWith("www") && str.endsWith(".com");
    }
    
    /*
     * 加密传入的手机号，将其中4位数字替换成*
     * @param number: 要加密的手机号
     * @return String: 加密后的结果
     * @author Mr.yu
     * @date 2022/10/17 10:03
     */
    public static String encryptedNumber(String number){

        StringBuilder sb = new StringBuilder(number);

        sb.replace(3,7,"****");

        return sb.toString();
    }

    public static void main(String[] args) {

//        String str1 = "www.baidu.com";
//        String str2 = "baidu.com";
//        String str3 = "www.baidu";
//
//        boolean website = isWebsite(str1);
//        boolean website1 = isWebsite(str2);
//        boolean website2 = isWebsite(str3);
//
//        System.out.println(str1+"是不是网址:"+website);
//        System.out.println(str2+"是不是网址:"+website1);
//        System.out.println(str3+"是不是网址:"+website2);

//        System.out.println(encryptedNumber("18888888888"));

//        String ip = "169.248.15.26";
//
//        int index = ip.lastIndexOf(".");
//        String num1 = ip.substring(0, index);
//        String num2 = ip.substring(index + 1);
//
//        System.out.println("改ip的网络地址为："+num1);
//        System.out.println("改ip的计算机号为："+num2);
    }


}
