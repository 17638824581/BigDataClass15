package com.xty.bean;

import javax.sql.rowset.serial.SerialBlob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Double price;
    private Integer sales;
    private Integer count;
    private SerialBlob picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SerialBlob getPicture() {
        return picture;
    }

//    public void setPicture(SerialBlob picture) {
//        this.picture = picture;
//    }

    public void setPicture(byte[] data) {
        System.out.println("setPicture被调用了！");
        try {
            this.picture = new SerialBlob(data);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


//    public void setPricture(String imgPath) {
//        File file = new File(imgPath);
//        if (file.exists()){
//            byte[] bytes = new byte[(int) file.length()];
//            SerialBlob serialBlob = null;
//            try {
//                FileInputStream fileInputStream = new FileInputStream(file);
//                fileInputStream.read(bytes);
//                serialBlob = new SerialBlob(bytes);
//                this.picture = serialBlob;
//            } catch (IOException | SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }else{
//            throw new RuntimeException("图片路径【"+imgPath+"】不存在！");
//        }
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", count=" + count +
                ", picture=" + picture +
                '}';
    }
}
