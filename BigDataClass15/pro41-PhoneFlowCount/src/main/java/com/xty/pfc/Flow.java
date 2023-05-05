package com.xty.pfc;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Flow implements Writable {

    // 上行流量
    private Long upFlow;
    // 下行流量
    private Long downFlow;
    // 总流量
    private Long sumFlow;

    public Flow() {
    }

    public Flow(Long upFlow, Long downFlow) {
        this.upFlow = upFlow;
        this.downFlow = downFlow;
        this.sumFlow = upFlow+downFlow;
    }

    public Long getUpFlow() {
        return upFlow;
    }

    public void setUpFlow(Long upFlow) {
        this.upFlow = upFlow;
    }

    public Long getDownFlow() {
        return downFlow;
    }

    public void setDownFlow(Long downFlow) {
        this.downFlow = downFlow;
    }

    public Long getSumFlow() {
        return sumFlow;
    }

    public void setSumFlow(Long sumFlow) {
        this.sumFlow = sumFlow;
    }

    @Override
    // 序列化方法，将对象中所有的属性按照 顺序 依次写出。
    public void write(DataOutput dataOutput) throws IOException {
        // 写出上行流量值
        dataOutput.writeLong(upFlow);
        // 写出下行流量值
        dataOutput.writeLong(downFlow);
        // 写出总流量值
        dataOutput.writeLong(sumFlow);
    }

    @Override
    // 反序列化方法，把 dataInput 中所存储的属性值，按照 序列化 时候的顺序，依次读出，再将 读出的值 赋给对象的属性。
    public void readFields(DataInput dataInput) throws IOException {
        // 读出上行流量值
        this.upFlow = dataInput.readLong();
        // 读出下行流量值
        this.downFlow = dataInput.readLong();
        // 读出总流量值
        this.sumFlow = dataInput.readLong();
    }

    @Override
    // 重写 toString 是在我们将 Flow 对象作为 MR 程序最终输出结果的时候，所展示出的结果格式
    public String toString() {
        return this.upFlow+"\t"+this.downFlow+"\t"+this.sumFlow;
    }
}
