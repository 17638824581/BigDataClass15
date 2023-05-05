package com.xty.pfc;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class PhoneNumPartitioner extends Partitioner<Text, Flow> {
    @Override
    /*
     * 136、分区0
     * 137、分区1
     * 138、分区2
     * 139、分区3
     * 其他、分区4
     * */
    public int getPartition(Text text, Flow flow, int numPartitions) {
        // 获取当前手机号
        String num = text.toString();
        // 判断手机号前三位
        if (num.startsWith("136")){
            return 0;
        }else if (num.startsWith("137")){
            return 1;
        }else if(num.startsWith("138")){
            return 2;
        }else if (num.startsWith("139")){
            return 3;
        }else {
            return 4;
        }

    }
}
