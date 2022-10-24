package com.xty.MyArrayList;

/*
 * 仿照 ArrayList 写的一个 简单的存储 Student 型元素的列表
 * @author Mr.yu
 * @date 2022/10/24 10:00
 */
public class MyArrayList {

    // 代表列表存储数据的数量
    private int size;

    // 内部用来存储元素的数组
    private int[] data;

    public MyArrayList() {
        size = 0;
        data = new int[10];
    }

    // 以指定长度初始化内部数组
    public MyArrayList(int initLength) {
        size = 0;
        data = new int[initLength];
    }


    // 扩充数组的方法,默认每次扩充 5 个长度
    private void grow(){
        // 先新建一个更长的数组
        int[] newData = new int[data.length + 5];

        // 将旧数组中的元素复制到新数组中
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        // 让 data 指向新数组
        this.data = newData;
    }

    public int getSize() {
        return size;
    }

    // 功能方法:
    // add() : 添加元素到结尾
    public void add(int i){
        // 如果内部数组存满了，我们需要扩充数组长度
        if (size == data.length) {
            grow();
        }
        data[size] = i;
        size ++;
    }

    // add(): 添加元素到指定位置
    public boolean add(int index,int value){
        if (index<size){
            // 如果内部数组存满了，我们需要扩充数组长度
            if (size == data.length) {
                grow();
            }

            // 把要插入的索引位，及之后的元素，往后挪一位，将索引位腾出来
            for (int i = size-1; i >= index; i--) {
                data[i+1] = data[i];
            }
            // 将数据存到索引位
            data[index] = value;
            size++;
            return true;

        }else if(index == size){
            add(value);
            return true;
        }else{
            return false;
        }
    }

    // get()：获取元素
    public int get(int index){
        if (index < size) {
            return data[index];
        }else{
            // 抛出错误
            throw new ArrayIndexOutOfBoundsException("索引超出范围！");
        }
    }

    // indexOf(): 查找元素首次出现的位置
    public int indexOf(int value){
        // 遍历内部数组
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value){
                return i;
            }
        }
        return -1;
    }

    // 查找元素最后出现的位置
    public int lastIndexOf(int value){
        // 遍历内部数组
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] == value){
                return i;
            }
        }
        return -1;
    }


    // removeByValue): 根据元素值删除元素
    public boolean removeByValue(int value){
        // 先找到元素位置
        int index = indexOf(value);
        if (index == -1){
            return false;
        }else{
            removeByIndex(index);
            return true;
        }
    }


    // removeByIndex(): 根据索引位置删除元素
    public void removeByIndex(int index){
        // 数组删除元素，需要把要删除的元素之后的元素都往前挪一位
        for (int i = index; i < size-1 ; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    // set(): 修改元素
    public boolean set(int index, int value){
        if (index < size){
            data[index] = value;
            return true;
        }else{
            return false;
        }
    }

    // toString() 方法：将本类对象，转换为字符串形式，方便打印
    public String toString(){

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i == size-1){
                sb.append(data[i]);
            }else{
                sb.append(data[i]+", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

}
