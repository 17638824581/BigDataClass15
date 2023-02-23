package com.xty.dao.impl;

import com.xty.bean.Book;
import com.xty.dao.BaseDao;
import com.xty.dao.BookDao;
import com.xty.util.JdbcUtil;

import java.sql.Connection;
import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public boolean add(Book book) {
        String sql = "insert into books(title,author,price,sales,count,picture) values(?,?,?,?,?,?)";
        Connection conn = JdbcUtil.getConn();
        int update = super.update(conn, sql, book.getTitle(), book.getAuthor(), book.getPrice(), book.getSales(), book.getCount(), book.getPicture());
        JdbcUtil.close(conn);
        return update == 1;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public Book selectById(int id) {
        String sql = "select * from books where id = ?";
        Connection conn = JdbcUtil.getConn();
        Book book = super.queryOne(Book.class, conn, sql, id);
        JdbcUtil.close(conn);
        return book;
    }

    @Override
    public List<Book> selectByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> selectByAuthor(String author) {
        return null;
    }

    @Override
    public boolean update(int id, Book newbook) {
        return false;
    }

    @Override
    public int selectCount() {
        return 0;
    }
}
