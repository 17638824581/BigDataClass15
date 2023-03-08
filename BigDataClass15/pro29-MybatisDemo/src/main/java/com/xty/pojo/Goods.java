package com.xty.pojo;

/**
 * Goods 类是 tb_goods 这张表的实体类
 */
public class Goods {
    private Integer id;
    private String goodsName;
    private String goodsType;
    private Double goodsPrice;
    private Integer count;
    private String brandName;
    private Integer status;

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", count=" + count +
                ", brandName='" + brandName + '\'' +
                ", status=" + status +
                '}';
    }
}
