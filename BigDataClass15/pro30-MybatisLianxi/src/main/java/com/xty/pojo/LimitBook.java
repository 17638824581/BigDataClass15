package com.xty.pojo;

import java.util.List;

public class LimitBook {
    private int total;
    private List<Book> books;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getTotal() {
        return total;
    }

    public List<Book> getBooks() {
        return books;
    }
}
