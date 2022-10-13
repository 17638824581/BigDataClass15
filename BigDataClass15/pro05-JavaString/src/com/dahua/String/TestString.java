package com.dahua.String;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {


        // 1. equles()
        // 2. charAt()
        // 3. length()
        // 4. repeat()
        // 5. replace()
        // 6. replaceAll()
        // 7. indexOf()
        // 8. lastIndexOf()
        // 9. strip()
        // 10.subString()
        // 11.split()



        // 定义一个字符串类型的变量
//        String s3 = "abc";
//        String s4 = "aeb";

        // 字符数组转字符串
//        char[] c = {'我','今','天','吃','了','饭'};
//        String s = new String(c);

        // 如果两个字符串，是对象的话，该如何   比较字符串的内容是否相同？
        // equals() 方法，就是比较两个字符串内容是否相同，这个方法会返回一个 布尔型的结果


        // 登录案例

        // 预设正确密码与账号
//        String username = "abc123";
//        String password = "123456";
//
//
//        Scanner sc = new Scanner(System.in);
//
//        // 代表登录状态
//        boolean isLogin = false;
//
//        // 三次登录机会
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入用户名：");
//            String uname = sc.next();
//            System.out.println("请输入密码：");
//            String psd = sc.next();
//
//            // 验证用户名和密码
//            if (uname.equals(username) && psd.equals(password)){
//                isLogin = true;
//                break;
//            }else{
//                System.out.println("账号或密码错误，请重试");
//            }
//        }
//
//        if (isLogin){
//            System.out.println("登录成功！欢迎使用！");
//        }else{
//            System.out.println("三次机会已用完，请稍后再试！~");
//        }

//        char[] c = {'A','B','C','D','E','F'};
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
        // 链式调用：可以避免创建不必要的对象

        // 通过Scanner对象的next() 方法，获取字符串输入
//        String s = new Scanner(System.in).next();
//
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

        // equles()
        // charAt()


        // 统计字符个数
        // 给一个字符串，统计字符串中有多少个 大写字母、小写字母、数字
//        String str = "asdgoiuwhdgou2oOSJGOI23poij 98uj24ioj 09U9023-0+_)+_!#409U8Pof";
//
//        // 表示大写字母字符有几个
//        int bigChar = 0;
//        // 表示小写字符有几个
//        int smallChar = 0;
//        // 表示数字字符有几个
//        int numChar = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            // c 表示字符串中 索引为 i 的那个字符
//            char c = str.charAt(i);
//
//            // 判断是什么字符
//            if (c >= 65 && c <= 65 + 25) {
//                bigChar++;
//            } else if (c >= 97 && c <= 97 + 25) {
//                smallChar++;
//            } else if (c >= 48 && c <= 57) {
//                numChar++;
//            }
//        }
//
//        System.out.println("字符串：" + str + "中，有大写字母" + bigChar + "个，小写字母" + smallChar + "个，数字" + numChar + "个");


        // 字符串拼接

//        String str1 = "我今天";
//
//        String str2 = "很开心";
//
//
//        String str3 = str1 + str2;
//
//        System.out.println(str3);



        // 把数组中的元素拼接到字符串中
        //  {9,5,48,51,6,83,684,2,3}  =》 "[9,5,48,51,6,83,684,2,3]"
//        int[] arr = {9,5,48,51,6,83,684,2,3};
//
//
//        // 空白的字符串
//        String s = "";
//
//        s += "[";
//
//        for (int i = 0; i < arr.length; i++) {
//            s += arr[i];
//            if (i != arr.length-1){
//                s += ", ";
//            }
//        }
//
//        s+= "]";
//
//        System.out.println(s);

        // 反转字符串
//        String str = "我爱你大华";
//
//        String str2 = "";
//
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            str2 += str.charAt(i);
//        }
//
//        System.out.println(str2);


        // split() 字符串分割

//        String str = "张三，李四，王五，赵六，田七";
//
//        // str.split(regex) , 按照 regex 去分割 str，结果是一个 字符串数组
//
//        String[] s = str.split("，");
//
//
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }


        // repeat()  重复字符串

//        String str = "我爱你";
//
//        String repeat = str.repeat(10);
//
//        System.out.println(repeat);


        // replace() 替换字符，会替换掉全部

//        String str = "我爱你，爱爱爱";
//
//        String new_str = str.replace('爱', '恨');
//
//
//        System.out.println(new_str);

        // replaceAll() 替换字符串，会替换掉全部符合条件的字符串

//        String str = "我爱你王伟，王伟我爱你。";
//
//        String newStr = str.replaceAll("王伟", "大美女");
//        System.out.println(newStr);


        // indexOf()  查找子字符串的首次出现的位置
        // lastIndexOf()    查找子字符串的最后一次出现的位置

        // strip()   去除字符串两边的空格



//        String str = "我爱你大美女，大美女我爱你";
//
//        System.out.println(str.strip());
//
//        int f_index = str.indexOf("大美女");
//        int l_index = str.lastIndexOf("大美女");
//
//        System.out.println("首次出现位置:"+f_index);
//        System.out.println("最后出现位置:"+l_index);

        // subString(int beginIndex)  从指定索引开始提取子串
        // subString(int beginIndex, int endIndex)  从指定索引开始,到指定索引结束,提取子串

//        String str = "我爱你大美女，大美女我爱你";
//
//        String subStr1 = str.substring(5);
//        String subStr2 = str.substring(3,8);
//
//        System.out.println(subStr1);
//        System.out.println(subStr2);


    }
}
