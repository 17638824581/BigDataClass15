package com.dahua.dao;

import com.dahua.bean.Book;

import java.util.List;

public interface BookDao{

    /*
    *  添加图书
    * */
    boolean add(Book book);

    /*
    *  根据id删除图片
    * */
    boolean deleteById(int id);

    /*
    *  根据id查找图书
    * */
    Book selectById(int id);

    /*
    *  根据书名查找图书
    * */
    List<Book> selectByTitle(String title);

    /*
    *  根据作者查找图书
    * */
    List<Book> selectByAuthor(String author);

    /*
    *  根据id更新图书
    * */
    boolean update(int id, Book newbook);

    /*
    *  查询图书数量
    * */
    int selectCount();
}
