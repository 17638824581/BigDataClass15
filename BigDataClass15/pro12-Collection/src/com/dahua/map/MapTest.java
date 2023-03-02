package com.dahua.map;

import com.dahua.genericity.Person;
import com.dahua.genericity.Student;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        // 所有的Map集合：键唯一，但值可以重复。

        // HashMap 是一个 Map 集合实现类，底层原理也是 哈希表。
        // 无序，不保证内部键值对的顺序。
        // 键可以为 null

        // LinkedHashMap 底层原理是，链表 和 哈希表 实现的 Map 集合。
        //  有序，能保证 键值对的 存取顺序。
        // 键可以为 null

        // TreeMap 底层原理是 红黑树（平衡二叉查找树），具有排序效果。
        // 会根据键的大小进行排序
        // 键不能为 null
        // 如果键比较相等，会被当作重复元素，不进行存储。


        TreeMap<Student, Person> hm = new TreeMap<>((s1,s2)-> s1.getAge()-s2.getAge() > 0 ? 1 : -1);
        // 使用 put() 方法添加键值对

        hm.put(new Student("小李",20,"h5"),new Person("张三",10));
        hm.put(new Student("小王",23,"h5"),new Person("李四",20));
        hm.put(new Student("小张",24,"h5"),new Person("王五",30));
        hm.put(new Student("小黑",57,"h5"),new Person("赵高",40));
        hm.put(new Student("小白",86,"h5"),new Person("赵高",40));
        hm.put(new Student("小红",10,"h5"),null);

        hm.forEach((k,v)-> System.out.println(k+"="+v));


//
//
//        // 判断 键 或 值 在不在 Map 集合中
//        //  containsKey()  判断指定的键，在不在集合中
//
////        boolean b = hm.containsKey("002");
////        System.out.println(b);
//        //  containsValue()  判断指定的值，在不在集合中
//        boolean bb = hm.containsValue(new Person("王五", 30));
//        System.out.println(bb);



        // 怎么取出 Map 集合中的元素？
        //  使用 get() 方法，来通过 键 取得 对应的 值，若该键不存在，则返回 null

        //  怎么获取到键？
/*        Set<String> keys = hm.keySet();
        System.out.println("keys = " + keys);

        //  不通过键，获取值？
        Collection<String> values = hm.values();
        System.out.println("values = " + values);*/

        // 怎么遍历 Map 集合？
        // 1. 遍历所有键，取得所有值
//        for (String k : keys) {
//            String v = hm.get(k);
//            System.out.println(k+"="+v);
//        }

        // 2.  Entry 就是 Map 集合中的 键值对 对象。
        //      entrySet() 获取所有的键值对元素
       /* Set<Map.Entry<String, String>> entrys = hm.entrySet();

        // 显式遍历
        for (Map.Entry<String, String> entry : entrys) {
            entry.setValue("黑色拖鞋");
        }*/

        // 3. 使用 Map 集合中的 forEach() 方法来 隐式遍历，需要传入你要进行的操作（Map 会自己在内部 遍历自己 然后执行你传入的操作）
//        hm.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String k, String v) {
//                System.out.println(k+"="+v);
//            }
//        });


        // Map 集合删除元素，remove()方法
//
//        System.out.println("删除之前"+hm);
//        boolean v = hm.remove("钥匙5","蓝色拖鞋");
//        System.out.println(v);
//
//        System.out.println("删除之后"+hm);

        // Map 集合修改元素， replace() 方法
//        hm.replace()
//        System.out.println("修改之前"+hm);
//        boolean replace = hm.replace("钥匙4", "绿拖鞋", "粉色拖鞋");
//        System.out.println(replace);
//        System.out.println("修改之后"+hm);




        // Map 接口是双列集合的顶层接口，与 Collection 接口同级。
        //  Map 所代表的双列集合，所谓“双列”，指的是存储数据时需要提供两个参数：key 和 value，通常称为"键值对"
        //  Map 中所存储的元素都是 键值对，通过键来获取对应的值。其中，key 也就是键，是不可以重复的。也就是在同一个 Map 中，不能有重复的键存在。
        //  Map 接口常用的实现类有：

        //  1. Hashtable：基于哈希表的实现类，线程安全，不保证元素顺序。效率低，不建议使用


        //  2. HashMap：基于哈希表实现的 Map集合，不保证元素顺序，允许空键和空值。
        //      (HashMap类大致相当于Hashtable，除了它是非同步的，并且允许为空值。)

        //  3. LinkedHashMap：基于哈希表和链表的 Map 集合实现，保证元素的存储顺序。


        //  4. TreeMap：基于红黑树 Map 集合实现，不保证元素顺序，可以通过 key 的大小对元素进行排序。


        //  5. Properties：Properties类表示一组持久的属性。
        //      属性可以保存到流中，也可以从流加载。属性列表中的每个键及其对应值都是字符串。
        //      属性列表可以包含另一个属性列表作为它的“默认值”;如果在原始属性列表中没有找到属性键，则搜索第二个属性列表。


        // Map 集合获取元素值：使用get(key)方法，通过键获取对应的值。

        // Map 结合修改元素值：使用replace(key,newValue)方法：使用新的值，替换对应键的值。

        // Map 集合的遍历：
        // 方式一：根据键查找值，使用 keySet() 方法获取所有键的 Set集合。
        // 方式二：根据键值对对象找键和值，使用 entrySet() 方法获取所有键的 Set集合。


    }
}
