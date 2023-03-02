package com.dahua.StudentArrayList;

/**
 * 一个存储学生对象的列表
 * @author Mr.yu
 * @date 2022/10/25 15:46
 */
public class MyStudentList {

    // 内部真正存储数据的数组
    private Student[] data;
    // 列表中存储了几个元素的属性
    private int size;

    // 以默认 10 的初始长度初始化内部数组
    public MyStudentList() {
        data = new Student[10];
        size = 0;
    }

    // 以指定的长度初始化内部的数组
    public MyStudentList(int initSize) {
        data = new Student[initSize];
        size = 0;
    }

    //  1. 增加元素（在头部/尾部/其余地方）
    // 将元素添加到列表尾部
    public void add(Student stu){
        // 先判断内部数组容量是否已满
        if(data.length == size){
            grow();
        }

        data[size] = stu;
        size++;
    }

    // 按照索引插入元素
    public boolean add(int index, Student stu){

        // 先判断内部数组容量是否已满
        if(data.length == size){
            grow();
        }

        // 判断索引有没有越界
        if(index > size){
            return false;
        }

        if(index == size){
            add(stu);
            return true;
        }

        // 将已有的元素往后挪一位
        for (int i = size; i > index ; i--) {
            data[i] = data[i-1];
        }

        // 再将要添加的元素插入到指定位置
        data[index] = stu;
        size++;
        return true;
    }

    //  2. 删除元素
    // 1. 根据元素删除
    public boolean delete(Student s){
        int index = indexOf(s);
        if (index == -1){
            return false;
        }

        delete(index);
        return true;
    }

    // 2. 根据索引删除
    public boolean delete(int index){
        if (index >= size){
            return false;
        }

        if (index == size-1){
            size--;
            return true;
        }

        for (int i = index; i < size-1 ; i++) {
            data[i] = data[i+1];
        }
        size--;
        return true;
    }



    //  3. 扩容
    // 增长内部数组的容量 + 10
    private void grow(){
        Student[] newArr = new Student[data.length + 10];
        // 将 data 中的元素复制到 newArr 中
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
        // 将扩充完毕的新数组交给 data 变量
        data = newArr;
    }

    //  4. 获取有效长度
    public int getSize(){
        return size;
    }

    //  5. 判断列表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //  6. 获取某位置元素（头部/尾部/其余地方）
    public Student get(int index){
        if (index >= size){
            return null;
        }
        return data[index];
    }

    //  7. 改变某位置的元素
    public boolean set(int index, Student stu){
        if (index >= size){
            return false;
        }
        data[index] = stu;
        return true;
    }

    //  8. 按照学号寻找元素，返回下标。如果返回-1，代表没有这个学号的学生
    public int findStudentById(String id){
        for (int i = 0; i < size; i++) {
            if (data[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //  8. 按照对象寻找元素，返回下标。如果返回-1，代表没有这个学号的学生
    public int indexOf(Student stu){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(stu)) {
                return i;
            }
        }
        return -1;
    }

    //  9. 列表是否包含某元素
    public boolean isExists(Student s){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    //  11. 清除列表
    public void clear(){
        size = 0;
    }

    //  12. 交换列表中两位置的元素
    // 交换 index1 和 index2 元素
    public boolean exchange(int index1, int index2){
        // 判断索引是否越界
        if (index1 >= size || index2 >= size){
            return false;
        }

        Student temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

        return true;
    }


    //  13. 重写 toString() 方法
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
