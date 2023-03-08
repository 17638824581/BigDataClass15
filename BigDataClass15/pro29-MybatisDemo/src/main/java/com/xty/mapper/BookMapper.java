package com.xty.mapper;

import com.xty.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {
    // 添加书籍
    @Insert("insert into books(title, author, price, sales, count) values(#{title},#{author},#{price},#{sales},#{count});")
    int add(Book book);

    // 删除书籍
    @Delete("delete from books where id = #{id}")
    int deleteById(int id);

    // 批量删除
    int deleteByIds(@Param("ids") int[] ids);

    // 修改书籍
    @Update("update books set title=#{title},author=#{author},price=#{price},sales=#{sales},count=#{count} where id=#{id}")
    int update(Book book);

    // 查询全部
    @Select("select * from books;")
    List<Book> selectAll();

    // 查询单条
    @Select("select * from books where id = #{id}")
    Book selectById(int id);
}
