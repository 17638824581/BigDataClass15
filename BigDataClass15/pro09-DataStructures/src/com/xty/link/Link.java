package com.xty.link;

/**
 * 链表类：由一个个Node组成链表，
 *  链表类中提供对节点的 增删改查等方法
 * @author Mr.yu
 * @date 2022/10/27 17:52
 */
public class Link {
    // 想要保存一条链表，只需保存它的头节点就行
    private Node head;
    // 保存当前链表有多长
    private int length;

    public Link() {
    }

    // 添加元素 add()
    public void add(int i){
        Node node = new Node();
        node.setData(i);

        // 当链表中没有节点时
        if (head == null){
            head = node;
        }else{
            // 当链表中有节点时，需要找到最后的节点，把新节点存到最后的节点上
            Node n = head;
            while (n.getNext() != null){
                n = n.getNext();
            }
            // 循环结束之后，n就是最后一个节点
            n.setNext(node);
        }

        length++;
    }

    // 删除元素 remove()
    // 修改元素 update(index i, int value)
    // 查找元素 int indexOf(value)


//    @Override
//    public String toString() {
//        return "Link{" +
//                "head=" + head +
//                ", length=" + length +
//                '}';
//    }
}
