package com.xty.collection.stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        /*
            Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
            Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

            这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
            元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
        */

        /*
        什么是 Stream？
        Stream 不是集合元素，它不是数据结构并不保存数据，它是有关算法和计算的，它更像一个高级版本的 Iterator。
            原始版本的 Iterator，用户只能显式地一个一个遍历元素并对其执行某些操作；
            高级版本的 Stream，用户只要给出需要对其包含的元素执行什么操作，比如 “过滤掉长度大于 10 的字符串”、
                 “获取每个字符串的首字母”等，Stream 会隐式地在内部进行遍历，做出相应的数据转换。

        Stream 就如同一个迭代器（Iterator），单向，不可往复，数据只能遍历一次，遍历过一次后即用尽了，就好比流水从面前流过，一去不复返。
            而和迭代器又不同的是，Stream 可以并行化操作，迭代器只能命令式地、串行化操作。
            顾名思义，当使用串行方式去遍历时，每个 item 读完后再读下一个 item。
            而使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
            Stream 的并行操作依赖于 Java7 中引入的 Fork/Join 框架（JSR166y）来拆分任务和加速处理过程。
        */

        /*
            怎么生成流？
            在 Java 8 中, 集合接口有两个方法来生成流：

                1. stream() − 为集合创建串行流（使用单个线程挨个处理流的元素）。

                2. parallelStream() − 为集合创建并行流（使用多个线程同时处理流的元素）。
                    parallelStream 是流并行处理程序的代替方法。以下实例我们使用 parallelStream 来输出空字符串的数量：
        */


        /*
         * 流的常用方法：
         *   操作流的方法分为 中间操作，和最终操作两种。
         *   最终操作：使用后不会返回新的流。
         *   中间操作：使用后会返回新的流。
         *
         *   最终操作方法：
         *   1. forEach()：遍历，对每一个流元素使用一次操作器，返回空。
         *   2. forEachOrdered()：遍历，顺序执行并行流，对每一个流元素使用一次操作器，返回空。
         *   3. min()：根据提供的比较器，返回流中最小元素。
         *   4. max()：根据提供的比较器，返回流中最大元素。
         *   5. count()：返回流中元素个数。
         *   6. anyMatch()：返回流中是否具有符合指定条件（谓词）的元素，返回布尔值。
         *   7. allMatch()：返回流中全部元素是否都 符合指定条件（谓词），返回布尔值。
         *   8. noneMatch()：返回流中全部元素是否都 不符合指定条件（谓词），返回布尔值。
         *   9. toArray()：使用流中元素组成一个数组并返回。
         *   10. collect()：收集，将流中元素使用指定收集器收集为一个其他类型的容器。
         *       --- Collectors 类中提供了常用的收集器：
         *           1. Collectors.toList(): 将流中元素收集到一个新的 List 集合中并返回。
         *           2. Collectors.toSet(): 将流中元素收集到一个新的 Set 集合中并返回。
         *           3. Collectors.toMap(fn1,fn2): 将流中元素收集到一个新的 Map 集合中并返回，新Map集合的键值对由 fn1、fn2 方法决定。
         *           4. Collectors.toMap(fn1,fn2): 将流中元素连接到一个 String 字符串中并返回。
         *   11. reduce()：聚合，使用指定二元运算器，将流中所有元素进行运算，最终得到单独的运算结果。
         *
         *   中间操作方法：
         *   1. map()：映射，对流中每个元素使用指定操作，将操作后的结果组成新的流并返回。
         *   2. filter()：过滤，使用指定条件(谓词)，过滤出流中符合条件的元素，返回流。
         *   3. limit()：截取，从流中取出指定个数的元素，组成新的流并返回。
         *   4. skip()：跳过，跳过指定个数的元素，返回剩余元素的流。
         *   5. sorted()：排序，使用指定比较器，对流中元素进行排序，返回流。
         *   6. distinct()：去重，使用元素的 equlas() 方法，取出流中不同的元素组成新的流并返回。
         *   7. takeWhile()：采集，使用指定条件(谓词)，过滤出流中前n个符合条件的元素，直到遇到不符合条件的元素停止，将过滤出的元素组成新流并返回。
         *   8. dropWhile()：丢弃，使用指定条件(谓词)，丢弃掉流中前n个符合条件的元素，直到遇到不符合条件的元素停止，将剩余的元素组成新流并返回。
         *
         *   其他方法：
         *       Stream.concat(stream1,stream2)：将两个流合并为一个新的流，并返回。
         * */


        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);


    }
}
