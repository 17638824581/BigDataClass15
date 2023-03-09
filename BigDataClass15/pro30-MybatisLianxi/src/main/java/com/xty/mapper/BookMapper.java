package com.xty.mapper;

import com.xty.pojo.Book;
import com.xty.pojo.BookCondition;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {
    // 添加书籍
    @Insert("insert into book(title, author, type, price) values (#{title},#{author},#{type},#{price})")
    boolean add(Book book);

    // 根据 id 删除书籍
    @Delete("delete from book where id = #{id}")
    boolean deleteById(int id);

    // 更新书籍
    @Update("update book set title=#{title},author=#{author},type=#{type},price=#{price} where id = #{id}")
    boolean update(Book book);

    // 查询所有
    @Select("select * from book")
    List<Book> seleteAll();

    // 根据 id 查询
    @Select("select * from book where id = #{id}")
    Book selectById(int id);

    // 批量删除
    int deleteByIds(@Param("ids") int[] ids);

    // 查询所有数据的条数
    @Select("select count(*) from book")
    int selectTotalCount();

    // 查询符合条件的条数
    int selectConditionTotalConut(BookCondition bookCondition);

    // 分页条件查询
    List<Book> selectByConditionAndLimit(BookCondition bookCondition);
}
