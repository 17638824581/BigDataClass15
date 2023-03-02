package com.dahua.collection.set;

public interface MyHashTable {
    
    /**
     * 向哈希表中添加元素
     * @param str: 要添加的元素
     * @return void
     * @author Mr.yu
     * @date 2022/11/7 16:17
     */
    void add(String str);
    
    /**
     * 删除哈希表中指定的元素
     * @param str: 要删掉的元素
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    boolean remove(String str);
    
    /**
     * 返回哈希表中元素个数
     * @return int
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    int size();
    
    /**
     * 判断哈希表是否为空
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    boolean isEmpty();
    
    /**
     * 清空哈希表
     * @param : 
     * @return void
     * @author Mr.yu
     * @date 2022/11/7 16:19
     */
    void clear();
}
