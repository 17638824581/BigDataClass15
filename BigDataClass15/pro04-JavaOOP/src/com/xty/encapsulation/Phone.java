package com.xty.encapsulation;

// 手机类
public class Phone {

    // 品牌
    private String brand;
    // 价格
    private double price;
    // 型号
    private String type;
    // 尺寸大小

    // 构造方法
    public Phone() {
    }

    public Phone(String brand, double price, String type, double size) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.size = size;
    }

    // get和set方法
    private double size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // 打电话
    public void call(String number){
        System.out.println(this.brand+"牌"+this.type+"型号的手机呼叫"+number);
    }

    // 发短信
    public void sendMessage(String number, String mess){
        System.out.println(this.brand+"牌"+this.type+"型号的手机，给"+number+"发送信息："+mess);
    }

}
