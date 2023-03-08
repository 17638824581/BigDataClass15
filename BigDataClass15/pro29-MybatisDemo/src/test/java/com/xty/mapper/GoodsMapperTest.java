package com.xty.mapper;

import com.xty.pojo.Goods;
import com.xty.pojo.GoodsCondition;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/*
*  针对 GoodsMapper 接口的测试
* */
public class GoodsMapperTest {

    // 测试 selectAll
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goods = mapper.selectAll();

        System.out.println("goods = " + goods);

        sqlSession.close();
    }

    // 测试 selectById
    @Test
    public void testSelectById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = mapper.selectById(1);

        System.out.println("goods = " + goods);

        sqlSession.close();
    }

    // 测试 add
    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = new Goods();
        goods.setGoodsName("卫龙辣条");
        goods.setGoodsType("食品/副食");
        goods.setGoodsPrice(3.0);
        goods.setCount(2000);
        goods.setBrandName("卫龙");
        goods.setStatus(0);

        boolean add = mapper.add(goods);

        sqlSession.commit();
        System.out.println("add = " + add);
        sqlSession.close();
    }

    @Test
    public void testAppbyMap(){
        // 测试当接口方法传入了Map集合类型，如何处理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("goodsName","大刀肉");
        map.put("goodsType","副食");
        map.put("goodsPrice",5.8);
        map.put("count",100);
        map.put("brandName","不知道");
        map.put("status",1);

        System.out.println("map = " + map);

        boolean b = mapper.addByMap(map);

        System.out.println("b = " + b);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAddByCollection(){
        // 测试当接口方法传入了Map集合类型，如何处理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Set<Goods> al = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Goods goods = new Goods();
            goods.setGoodsName("商品"+i);
            goods.setGoodsType("类型"+i);
            goods.setGoodsPrice(i*5.0);
            goods.setBrandName("品牌"+i);
            goods.setStatus(1);
            goods.setCount(i);
            al.add(goods);
        }

        System.out.println("al = " + al);

        boolean b = mapper.addByCollection(al);
        System.out.println("b = " + b);

    }


    // 测试 update
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        // 修改 id = 8 的数据的 商品名 改为 哇哈哈

        // 如果是调用修改全部字段的方法的话
       /* // 1. 先查询 id = 8 的商品信息 --> goods
        Goods goods = mapper.selectById(8);
        System.out.println("goods = " + goods);
        // 2. 单独修改 goods 的商品名
        goods.setGoodsName("哇哈哈");
        System.out.println("goods = " + goods);
        // 3. goods 传入方法中执行修改
        mapper.update(goods);*/

        // 如果我们有动态修改字段的效果的话 只需要给出 id、新的属性值

        // 1. 手动创建一个 Goods 对象
        Goods goods = new Goods();
        // 2. 设置 goods 对象的 id 和要更新的属性值
        System.out.println("goods = " + goods);
        goods.setId(8);
        goods.setGoodsName("娃哈哈");
        System.out.println("goods = " + goods);
        // 3. 调用方法进行更新




        sqlSession.commit();
        sqlSession.close();
    }

    // 测试删除单条数据
    @Test
    public void testDeleteById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        boolean b = mapper.deleteById(5);

        System.out.println("b = " + b);
        sqlSession.commit();
        sqlSession.close();
    }

    // 测试批量删除
    @Test
    public void testDeleteByIds(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        int[] ids = {1,6};
        int row = mapper.deleteByIds(ids);
        System.out.println("row = " + row);

        sqlSession.commit();
        sqlSession.close();
    }

    // 测试动态修改字段
    @Test
    public void testUpdateByActivity(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = new Goods();
        goods.setId(8);

        goods.setGoodsName("奥利奥饼干");
        goods.setGoodsType("食品");
        goods.setCount(9999);
        goods.setStatus(1);

        boolean b = mapper.updateByActivity(goods);

        sqlSession.commit();
        sqlSession.close();

        System.out.println("b = " + b);
    }

    // 测试多条件查询
    @Test
    public void testSelectByConditino(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        GoodsCondition goodsCondition = new GoodsCondition();
        goodsCondition.setGoodsType("食品");

        List<Goods> goods = mapper.selectByCondition(goodsCondition);

        System.out.println("goods = " + goods);
    }

    // 测试单条件动态查询
    @Test
    public void testSelectSingleCondition(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        GoodsCondition goodsCondition = new GoodsCondition();
        goodsCondition.setGoodsName("%电磁炉%");
        goodsCondition.setGoodsType("%食品%");

        List<Goods> goods = mapper.selectBySingleCondition(goodsCondition);

        System.out.println("goods = " + goods);
    }

    // 测试添加返回主键
    @Test
    public void testAddReturnId(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = new Goods();
        goods.setGoodsName("王守义十三香");
        goods.setBrandName("王守义");
        goods.setGoodsPrice(9.9);
        goods.setCount(8000);
        goods.setStatus(1);

        System.out.println("goods = " + goods);

        int row = mapper.addReturnId(goods);

        System.out.println("row = " + row);
        System.out.println("goods = " + goods);

        sqlSession.commit();
        sqlSession.close();
    }


}
