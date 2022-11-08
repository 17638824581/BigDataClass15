package com.xty.collection.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

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
