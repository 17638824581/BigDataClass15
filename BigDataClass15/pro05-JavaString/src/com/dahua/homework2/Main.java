package com.dahua.homework2;

import java.util.*;

public class Main {


    // 获取一个随机的大写字母字符
    public static char getBigLetter(){
        Random r = new Random();
        int num = r.nextInt(26) + 65; // nextInt(26) 会产生 ([0~25] + 65) => [65~90] 的整数 [65~90]
        return (char) num;
    }

    // 获取一个随机的小写字母字符
    public static char getSmallLetter(){
        Random r = new Random();
        int num = r.nextInt(26) + 97; // nextInt(26) 会产生 ([0~25] + 65) => [65~90] 的整数 [65~90]
        return (char) num;
    }

    // 随机长度字符串
    public static String randomString(int len){
        // 产生长度为 len 的随机字符串
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        // 随机 -> 随机数 -> Random -> 产生随机数据
        for (int i = 0; i < len; i++) {
            // 每循环一次，就往 sb 中添加一个随机的字符（大小字母、数字）
            int num = r.nextInt(3);
            switch (num){
                case 0: // 如果num为0，则填入一个大写字母
                    sb.append(getBigLetter());
                    break;
                case 1: // 如果num为1，则填入一个小写字母
                    sb.append(getSmallLetter());
                    break;
                case 2: // 如果num为2，则填入一个数字
                    sb.append(r.nextInt(10));
                    break;
            }
        }

        return sb.toString();
    }

    // 从指定 字符串 中寻找指定 子串 的 所有位置。
    public static Integer[] findAllSubString(String str, String subStr){
        // 最后返回的是 由所有子字符串位置组成的数组
        ArrayList<Integer> al = new ArrayList<>();

        // fromIndex 用来记录 查找到哪了。
        int fromIndex = 0;

        while (true){
            int newIndex = str.indexOf(subStr, fromIndex);// 第一个 subStr 出现的位置
            // 如果 newIndex == -1，可能是找完了，也可能是 subStr 不存在 str 中。
            if (newIndex == -1){
                // 将 al 中存储的子字符串位置的数据，转为 Interget 类型的数组。并返回。
                Integer[] integers = al.toArray(new Integer[]{});
                return integers;
            }else{
                al.add(newIndex);
                fromIndex = newIndex + subStr.length();
            }
        }
    }

    // 统计给定由数字组成的字符串中，所有数字出现的次数
    public static void countNumber(String str){
        char[] chars = str.toCharArray();

        // 使用数组保存统计结果，
        // ints[0] 表示 数字 0 出现的次数
        // ints[1] 表示 数字 1 出现的次数...
        int[] ints = new int[10];

        // 遍历 chars，将 数字字符 c 对应的 记录次数 + 1
        for (char c: chars) {
            int i = Integer.parseInt(String.valueOf(c));
            ints[i] ++;
        }

        for (int i = 0; i < ints.length ; i++) {
            System.out.println("数字"+i+"出现的次数为："+ints[i]);
        }
    }

    // 字符串编码： aaaaabbbbcccd  ——>  a5b4c3d
    public static String encodingString(String str){
        // 使用 c 变量，来记录当前遍历的字符是哪个字符
        char c = str.charAt(0);
        // 表示 c 重复出现了几次
        int count = 0;
        // 使用 StringBuilder 来存储转换后的结果
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == c){
                count ++;
            }else{
                sb.append(c);
                sb.append(count==1 ? "" : count);
                // 更换当前记录的字符
                c = ch;
                count = 1;
            }
        }
        sb.append(c);
        sb.append(count==1 ? "" : count);

        return sb.toString();
    }

    // 字符串解码 a3b4cde4 ——> "aaabbbbcdeeee"
    public static String decodingString(String str){
        // StringBuilder 来保存转换结果
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        String nums = "";

        for(char c: chars){
            // 判断 c 不是数字
            if (!(c >= 48 && c <=57)){
                if (!nums.equals("")){
                    // 代表这前面的数字已经录入完毕 nums 就代表数字
                    int i = Integer.parseInt(nums);
                    for (int j = 0; j < i-1; j++) {
                        sb.append(sb.charAt(sb.length()-1));
                    }
                    nums = "";
                }
                sb.append(c);
            }else{
                nums += c;
            }
        }

        if (!nums.equals("")){
            // 代表这前面的数字已经录入完毕 nums 就代表数字
            int i = Integer.parseInt(nums);
            for (int j = 0; j < i-1; j++) {
                sb.append(sb.charAt(sb.length()-1));
            }
        }

        return sb.toString();
    }


    // 统计 c 在 str 中出现的次数
    public static int countChar(String str, char c){
        int count = 0;
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch == c){
                count++;
            }
        }

        return count;
    }


    // 统计字符串中每种字符出现的次数。
    //  str :
    public static void countAllChar(String str){
        // 1. 对这个字符串中所有元素去重。 ---> 只保留每种字符一个
        // “abbcdbacbcda”  -> "abcd"
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            // 寻找 c 之后和 c 一样的元素
            int index = sb.indexOf(String.valueOf(c), i + 1);
            if (index != -1){
                sb.deleteCharAt(i);
                i --;
            }
        }

        // 2. 遍历每种字符，看这个字符 在 str 中出现了几次。
        // 接下来统计每个字符出现次数
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int i1 = countChar(str, c);
            System.out.println("字符'"+c+"'在字符串中出现了："+i1+"次！");
        }
    }


    public static void main(String[] args) {
        countAllChar("ABCAACDBWDF");
    }


}
