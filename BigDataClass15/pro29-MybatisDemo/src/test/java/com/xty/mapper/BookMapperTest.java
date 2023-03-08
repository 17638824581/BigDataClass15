package com.xty.mapper;

import com.xty.pojo.Book;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BookMapperTest {

    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = new Book();
        book.setTitle("朝花夕拾");
        book.setAuthor("鲁迅");
        book.setPrice(99.0);
        book.setSales(44);
        book.setCount(500);

        int add = mapper.add(book);
        System.out.println("add = " + add);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int i = mapper.deleteById(517);

        System.out.println("i = " + i);

        sqlSession.close();

    }

    @Test
    public void testDeleteByIds(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int i = mapper.deleteByIds(new int[]{512, 513, 515});

        System.out.println("i = " + i);
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = new Book();
        book.setId(516);
        book.setAuthor("陈寿");
        book.setTitle("三国志");

        int update = mapper.update(book);

        System.out.println("update = " + update);
        sqlSession.close();

    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = mapper.selectAll();

        System.out.println("books = " + books);
    }

    @Test
    public void testSelectById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = mapper.selectById(518);

        System.out.println("book = " + book);
    }
}
