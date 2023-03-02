package com.dahua.map;

import com.dahua.map.palying.Card;

import java.util.*;

public class HomoWork {
    public static void main(String[] args) {

        /*// 1. 创建一个 HashMap 集合，存储 学号（String） : 学生对象（Student）

        HashMap<String, Student> hm = new HashMap<>();

        hm.put("s01",new Student("小光",18,"H5"));
        hm.put("s02",new Student("小美",17,"JAVA"));
        hm.put("s03",new Student("小名",19,"UI"));

        hm.forEach(new BiConsumer<String, Student>() {
            @Override
            public void accept(String s, Student student) {
                System.out.println("学号："+s+", 姓名："+student.getName()+",年龄："+student.getAge()+",班级："+student.getBanji());
            }
        });

        System.out.println("hm = " + hm);

        // 2. 创建一个 HashMap 集合，存储 学生对象(Student) : 学生地址(String)
        HashMap<Student, String> hm2 = new HashMap<>();

        // 遍历 hm 的值 -> 学生对象
        // 将学生对象作为键，再存到 hm2 中

        Collection<Student> stus = hm.values();
        Object[] stus2 = stus.toArray();

        for (int i = 0; i < stus2.length; i++) {
            hm2.put((Student) stus2[i],"家庭地址"+i);
        }

        System.out.println("hm2 = " + hm2);

        // 能不能通过 学生的学号，找到学生的家庭地址？

        String id = "s02";
        // 使用  hm 通过 学号获取学生对象
        Student s = hm.get("s02");
        // 使用 hm2 通过 学生对象获取学生地址
        String location = hm2.get(s);

        System.out.println("学号"+id+"，地址："+location);*/


        // 3. 使用 ArrayList 集合 存储 HashMap 集合。

       /* ArrayList< HashMap<String, String> > al = new ArrayList<>();

        // 先创建三个 HashMap 集合
        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        HashMap<String, String> hm3 = new HashMap<>();

        // 往三个 HashMap 集合中添加一些内容
        hm1.put("及时雨","宋江");
        hm1.put("黑旋风","李逵");
        hm1.put("花和尚","鲁智深");
        hm1.put("豹子头","林冲");

        hm2.put("齐天大圣","孙悟空");
        hm2.put("净坛使者","猪八戒");
        hm2.put("卷帘大将","沙悟净");

        hm3.put("云长","关羽");
        hm3.put("卧龙","诸葛亮");
        hm3.put("凤雏","庞统");

        // 将 三个 HashMap 集合存到 ArrayList 中
        al.add(hm1);
        al.add(hm2);
        al.add(hm3);

        System.out.println(al);

        // 遍历 这个 ArrayList
        // 方式一：使用 显式 forEach + 隐式 forEach 遍历
        for (HashMap<String, String> hm : al) {
            System.out.println("--------------新的HashMap集合----------------");
            // 还要遍历 hm
            hm.forEach((k,v)-> System.out.println("键："+k+", 值："+v));
        }

        // 方式二：使用 隐式 forEach 遍历
        al.forEach((a)->{
            System.out.println("--------------新的HashMap集合----------------");
            a.forEach((k,v)-> System.out.println("键："+k+", 值："+v));
        });*/


        // 4. HashMap嵌套ArrayList
        /*
        * 创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的
        *   键是 String，
        *   值是 ArrayList
        *  每一个ArrayList的元素是String，并遍历。
        *
        * */

        /*HashMap<String, ArrayList<?>> hm = new HashMap<>();

        // 创建三个 ArrayList 集合

        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();

        // 往 ArrayList 中存储一些数据

        al1.add("张三");
        al1.add("李四");
        al1.add("王五");

        al2.add("孙悟空");
        al2.add("猪八戒");
        al2.add("沙和尚");

        al3.add("张飞");
        al3.add("关羽");
        al3.add("刘备");

        // 将三个 ArrayList 存到 HashMap 中
        hm.put("普通人名", al1);
        hm.put("西游记人名", al2);
        hm.put("三国演义人名", al3);


        // 遍历 这个 HashMap
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("键："+key);
            ArrayList<?> al = hm.get(key);
            // 还需要遍历 al
            al.forEach((o)-> System.out.println(o));
        }*/

        // 5. 统计一个字符串中每个字符出现的次数
//        String str = "asoi2ut09qu30g09uag09u-gai-ds0i1-309-09i-as9idg-szpvk;'plsdp[llt4[q42pl[t,';sdf/;.asdfoijaowu98u13";
//
//        HashMap<Character, Integer> hm = new HashMap<>();
//
//        // 1. 遍历这个字符串
//        for (int i = 0; i < str.length(); i++) {
//            // 2. 拿到其中的每个字符
//            char c = str.charAt(i);
//            // 3. 将字符存到 HashMap 中，字符作为 键，它出现的次数作为 值
//                // 存之前先判断这个字符是否已经存过，如果已经存过就让它对应的值 +1
//            if (hm.containsKey(c)){
//                hm.replace(c, hm.get(c)+1);
//            }else{
//                // 如果之前没有存储过c，则将c存到 HashMap 中
//                hm.put(c,1);
//            }
//        }
//
//        hm.forEach((k,v)-> System.out.println(k+"出现了："+v+"次"));

        // 6. 模拟斗地主发牌
        
        // 1. 创建一副牌
        // al 用来存储一副牌
        LinkedList<Card> al = new LinkedList<>();

        // 表示花色
        char[] colors = {'♠','♥','♣','♦'};
        // 表示点数
        String[] points = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        // 使用循环来创建 黑红梅方 A~K
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < points.length; j++) {
                Card card = new Card(points[j], colors[i]);
                al.add(card);
            }
        }

        // 添加大小王
        al.add(new Card("😺",'×'));
        al.add(new Card("🐯",'×'));

        // 洗牌
        Collections.shuffle(al);

        // 三个用户
        ArrayList<Card> user1 = new ArrayList<>();
        ArrayList<Card> user2 = new ArrayList<>();
        ArrayList<Card> user3 = new ArrayList<>();

        // 发牌给三个人
        while (al.size()>0){
            user1.add(al.pop());
            user2.add(al.pop());
            user3.add(al.pop());
        }

        // 理牌
        user1.sort((c1,c2)-> c1.getSize()-c2.getSize());
        user2.sort((c1,c2)-> c1.getSize()-c2.getSize());
        user3.sort((c1,c2)-> c1.getSize()-c2.getSize());

        // 打印三个人的牌
        System.out.println(concatCards(user1));
        System.out.println(concatCards(user2));
        System.out.println(concatCards(user3));

    }

    /**
     * 将所有的牌合为一排牌
     * @param cards
     * @return
     */
    public static String concatCards(Card... cards){
        StringBuilder sb = new StringBuilder();

        // 循环行数
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cards.length; j++) {
                sb.append(cards[j].getToStr().split("\n")[i]);
                sb.append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * 将所有的牌合为一排牌
     * @param cards
     * @return
     */
    public static String concatCards(List<Card> cards){
        StringBuilder sb = new StringBuilder();

        // 循环行数
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cards.size(); j++) {
                sb.append(cards.get(j).getToStr().split("\n")[i]);
                sb.append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
