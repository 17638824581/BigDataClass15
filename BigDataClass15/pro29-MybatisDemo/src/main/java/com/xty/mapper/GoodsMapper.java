package com.xty.mapper;

import com.xty.pojo.Goods;
import com.xty.pojo.GoodsCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GoodsMapper {

    // 查询全部
    List<Goods> selectAll();

    // 查询单条
    Goods selectById(int id);

    // 动态多条件查询
    List<Goods> selectByCondition(GoodsCondition condition);

    // 单条件动态查询
    List<Goods> selectBySingleCondition(GoodsCondition condition);

    // 添加
    boolean add(Goods goods);

    // 添加数据，返回主键
    int addReturnId(Goods goods);

    // 添加元素
    boolean addByMap(Map<String,Object> map);

    // 测试传入 Collection 集合
    boolean addByCollection(Set<Goods> goodss);

    // 修改全部字段
    boolean update(Goods goods);

    // 动态修改字段
    boolean updateByActivity(Goods goods);

    // 删除单条数据
    boolean deleteById(int id);

    // 批量删除
    int deleteByIds(@Param("ids") int[] ids);  // ids = {2,3,4}
}
