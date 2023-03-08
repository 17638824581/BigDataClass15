package com.xty.pojo;

/*
*  查询 goods 表的，多个条件所封装成的对象
* */
public class GoodsCondition {
    private String brandName;
    private String goodsName;
    private String goodsType;
    private Double minPrice;
    private Double maxPrice;
    private Integer status;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoodsCondition{" +
                "brandName='" + brandName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", status=" + status +
                '}';
    }
}
