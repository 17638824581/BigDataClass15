package com.xty.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/*
*  Mapper 类，是我们 MR 程序中执行 Map 阶段处理任务的类
*     1. 继承 Hadoop 提供的 Mapper 类。
*     2. 声明 map 阶段输入数据的 k、v 类型，以及输出的 k、v 类型。
*     3. 重写 Mapper 类中 map() 方法，写出 map 阶段的逻辑代码。
* */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    // 先定义输出类型的键值对对象
    private Text outK = new Text();
    private IntWritable outV = new IntWritable();

    @Override
    // map() 方法是 MapTask 的核心处理方法，每有一行数据被读入都会执行一次map方法。
    // 每一行数据执行一次 map() 方法
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {

        // 1. 获取当前行数据   a bb ccc ddd ee a
        String string = value.toString();

        // 2. 分割当前行数据
        String[] words = string.split(" ");  // [a,bb,ccc,ddd,ee,a]

        // 3. 将每个单词，组合为一个键值对，并写出
        for (String word : words) {

            // 4. 给要输出的 键值对赋值
            outK.set(word);
            outV.set(1);

            // 5. 调用 Context 对象的 write() 方法，写出数据
            context.write(outK,outV);
        }

        // map端写出的数据：
        /*
        *  a,1
        *  bb,1
        *  ccc,1
        *  ddd,1
        *  ee,1
        *  a,1
        *  bb,1
        *  cc,1
        *  ......
        * */

    }
}
