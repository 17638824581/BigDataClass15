package com.dahua.collections;

import java.util.*;

// 对于 Collections 类的测试
public class CollectionsTest {
    public static void main(String[] args) {
        // Collections 中常用方法
        //  fill(List, T): 将集合中所有的元素修改为 T
        //  replaceAll(List, T1, T2): 将集合中所有的 T1 修改为 T2
        //  reverse(List): 将集合反转
        //  sort(List, Comparator): 使用指定比较器对 集合进行排序。
        //  shuffle(List): 随机打乱集合中的元素顺序
        //  max(Collection, Comparator): 根据比较器的结果，获取集合中最大元素
        //  min(Collection, Comparator): 根据比较器的结果，获取集合中最小元素
        //  copy(List1, List2)：将 List2 中的元素 复制到 List1 中，复制后的元素保存原本的索引不变。
        //  binarySearch(List, T)：使用二分查找法，找出在 List 中的 T 元素的位置。
        //  swap(List, index1, index2)： 交换 List 中 index1 和 index2 位置的元素。
        //  rotate(List, length)：让 List 中的所有元素 都往前挪 length 个位置。最后的元素会挪到 List 的开头。


        LinkedList<Integer> ll = new LinkedList<>();
        Collections.addAll(ll,1,2,3,4,5,6,7,8,9,10);

        Collections.rotate(ll,3);

        System.out.println(ll);

    }
}
