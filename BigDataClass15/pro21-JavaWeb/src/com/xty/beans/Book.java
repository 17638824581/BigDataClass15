package com.xty.beans;

/**
 * 映射 xml 文件结构的 实体类
 * @author Mr.yu
 * @date 2023/2/15 11:21
 */
public class Book {
    private String name;
    private String author;
    private Double price;
    private Integer count;

    public Book() {
    }

    public Book(String name, String author, Double price, Integer count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
