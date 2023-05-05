package com.xty.partition;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * 一个自定义的分区器，按照 a-p 分到一个区 q-z 开头的分到另一个区
 */
public class MyPartition extends Partitioner<Text, LongWritable> {
    @Override
    // getPartition() 就是具体来分区的方法，通过返回分区的编号，来指定这一组数据走哪个分区
    public int getPartition(Text text, LongWritable longWritable, int numPartitions) {
        System.out.println("numPartitions = " + numPartitions);

        // 拿到这一对数据的单词
        String word = text.toString();
        if (word==null || word.equals("")){
            return 0;
        }
        word = word.toLowerCase();
        // 再拿到这个单词的第一个字母
        char c = word.charAt(0);
        // 如果开头字母是大于 p 的
        if (c>'p'){
            return 1;
        }else{
            return 0;
        }
    }
}
