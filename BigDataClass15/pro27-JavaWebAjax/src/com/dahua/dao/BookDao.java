package com.dahua.dao;

import com.dahua.bean.Book;

import java.util.List;

public interface BookDao {

    /**
     * 查询所有书籍
     * @return
     */
    List<Book> selectAll();

    /**
     * 通过 id 查询
     * @param id
     * @return
     */
    Book selectById(int id);

    /**
     * 通过作者查询
     * @param author
     * @return
     */
    List<Book> selectByAuthor(String author);

    /**
     * 通过书名查询
     * @param title
     * @return
     */
    List<Book> selectByTitle(String title);

    /**
     * 通过类型查询
     * @param type
     * @return
     */
    List<Book> selectByType(String type);

    /**
     * 添加书籍
     * @param book
     * @return
     */
    int add(Book book);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 更新除id外的书籍信息
     * @param id
     * @param newBook
     * @return
     */
    int update(int id, Book newBook);

    /**
     * 查询总数
     * @return
     */
    int selectByTotal();


    /*
    *  批量删除
    * */
    int batchDelte(int[] ids);

    /*
    *  分页查询
    * */
    List<Book> selectBylimit(int begin,int size);

    /*
    *  条件分页查询
    * */
    List<Book> selectByConditionAndLimit(String title,
                                         String author,
                                         String type,
                                         Double minPrice,
                                         Double maxPrice,
                                         int begin,
                                         int size);

    /*
     *  条件查询数据数量
     * */
    long selectByConditionTotal(String title,
                             String author,
                             String type,
                             Double minPrice,
                             Double maxPrice);

}
