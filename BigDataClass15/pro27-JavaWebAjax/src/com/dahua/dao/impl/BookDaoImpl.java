package com.dahua.dao.impl;

import com.dahua.bean.Book;
import com.dahua.dao.BaseDao;
import com.dahua.dao.BookDao;
import com.dahua.util.JdbcUtil;

import java.sql.Connection;
import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {
    /**
     * 查询所有书籍
     *
     * @return
     */
    @Override
    public List<Book> selectAll() {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from book";
        List<Book> books = super.queryAll(Book.class, conn, sql);
        JdbcUtil.close(conn);
        return books;
    }

    /**
     * 通过 id 查询
     *
     * @param id
     * @return
     */
    @Override
    public Book selectById(int id) {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from book where id = ?";
        Book book = super.queryOne(Book.class, conn, sql, id);
        JdbcUtil.close(conn);
        return book;
    }

    /**
     * 通过作者查询
     *
     * @param author
     * @return
     */
    @Override
    public List<Book> selectByAuthor(String author) {
        Connection conn = JdbcUtil.getConn();
        author = "%" + author + "%";
        String sql = "select * from book where author like ?";
        List<Book> books = super.queryAll(Book.class, conn, sql, author);
        JdbcUtil.close(conn);
        return books;
    }

    /**
     * 通过书名查询
     *
     * @param title
     * @return
     */
    @Override
    public List<Book> selectByTitle(String title) {
        Connection conn = JdbcUtil.getConn();
        title = "%" + title + "%";
        String sql = "select * from book where title like ?";
        List<Book> books = super.queryAll(Book.class, conn, sql, title);
        JdbcUtil.close(conn);
        return books;
    }

    /**
     * 通过类型查询
     *
     * @param type
     * @return
     */
    @Override
    public List<Book> selectByType(String type) {
        Connection conn = JdbcUtil.getConn();
        type = "%" + type + "%";
        String sql = "select * from book where type like ?";
        List<Book> books = super.queryAll(Book.class, conn, sql, type);
        JdbcUtil.close(conn);
        return books;
    }

    /**
     * 添加书籍
     *
     * @param book
     * @return
     */
    @Override
    public int add(Book book) {
        Connection conn = JdbcUtil.getConn();
        String sql = "insert into book(title,author,type,price) value(?,?,?,?)";
        int update = super.update(conn, sql, book.getTitle(), book.getAuthor(), book.getType(), book.getPrice());
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id) {
        Connection conn = JdbcUtil.getConn();
        String sql = "delete from book where id = ?";
        int update = super.update(conn, sql, id);
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 更新除id外的书籍信息
     *
     * @param id
     * @param newBook
     * @return
     */
    @Override
    public int update(int id, Book newBook) {
        Connection conn = JdbcUtil.getConn();
        String sql = "update book set title=?,author=?,type=?,price=? where id = ?";
        int update = super.update(conn, sql, newBook.getTitle(),newBook.getAuthor(),newBook.getType(),newBook.getPrice(),id);
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 查询总数
     *
     * @return
     */
    @Override
    public int selectByTotal() {
        Connection conn = JdbcUtil.getConn();
        String sql = "select count(*) from book";
        long size = (long) super.queryValue(conn, sql);
        int s = (int) size;
        JdbcUtil.close(conn);
        return s;
    }

    @Override
    public int batchDelte(int[] ids) {
        Connection conn = JdbcUtil.getConn();
        String sql = "delete from book where id in ";

        StringBuffer sb = new StringBuffer();
        sb.append("(");
        for (int i = 0; i < ids.length; i++) {
            sb.append(ids[i]);
            if (i != ids.length-1){
                sb.append(",");
            }
        }
        sb.append(")");

        sql += sb.toString();

        int update = super.update(conn, sql);
        JdbcUtil.close(conn);
        return update;
    }

    @Override
    public List<Book> selectBylimit(int begin, int size) {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from book limit ?,?";
        List<Book> books = super.queryAll(Book.class, conn, sql, begin, size);
        JdbcUtil.close(conn);
        return books;
    }

    @Override
    public List<Book> selectByConditionAndLimit(String title, String author, String type, Double minPrice, Double maxPrice, int begin, int size) {

        StringBuffer sql = new StringBuffer("select * from book where 1=1 ");
        if (title != null && !title.equals("")){
            sql.append("and title like '"+ title +"'");
        }
        if (author != null && !author.equals("")){
            sql.append(" and author like '" + author +"'");
        }
        if (type != null && !type.equals("")){
            sql.append(" and type like '" + type +"'");
        }
        if (minPrice != null){
            sql.append(" and price >= " + minPrice);
        }
        if (maxPrice != null){
            sql.append(" and price <= " + maxPrice);
        }
        sql.append(" limit "+begin+" , "+size);

        System.out.println(sql);
        Connection conn = JdbcUtil.getConn();
        List<Book> books = super.queryAll(Book.class, conn, sql.toString());
        JdbcUtil.close(conn);

        return books;
    }

    @Override
    public long selectByConditionTotal(String title, String author, String type, Double minPrice, Double maxPrice) {
        StringBuffer sql = new StringBuffer("select count(*) from book where 1=1 ");
        if (title != null && !title.equals("")){
            sql.append("and title like '"+ title +"'");
        }
        if (author != null && !author.equals("")){
            sql.append(" and author like '" + author +"'");
        }
        if (type != null && !type.equals("")){
            sql.append(" and type like '" + type +"'");
        }
        if (minPrice != null){
            sql.append(" and price >= " + minPrice);
        }
        if (maxPrice != null){
            sql.append(" and price <= " + maxPrice);
        }

        System.out.println(sql);
        Connection conn = JdbcUtil.getConn();
        long count = (long) super.queryValue(conn, sql.toString());
        JdbcUtil.close(conn);

        return count;
    }
}
