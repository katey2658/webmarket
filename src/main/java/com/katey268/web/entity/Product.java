package com.katey268.web.entity;

import java.util.Date;

/**
 * Created by 11456 on 2016/12/27.
 */
public class Product {

    /**
     * 产品号
     */
    private long productId;

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    /**
     * 商品类型
     */
    private String productType;

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    /**
     * 产品关键字
     */
    private String keywords;

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getKeywords() {
        return keywords;
    }

    /**
     * 产品标题
     */
    private String productTitle;

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductTitle() {
        return productTitle;
    }

    /**
     * 图片地址
     */
    private String productImage;

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductImage() {
        return productImage;
    }

    /**
     * 商品数量
     */
    private int productInitialNum;

    public void setProductInitialNum(int productInitialNum) {
        this.productInitialNum = productInitialNum;
    }

    public int getProductInitialNum() {
        return productInitialNum;
    }

    /**
     * 商品价格(单位，分）
     */
    private int productPrice;

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getProductPrice() {
        return productPrice;
    }

    /**
     * 产品描述（长宽高等,cm为单位）
     */
    private String displayMeasurements;

    public void setDisplayMeasurements(String displayMeasurements) {
        this.displayMeasurements = displayMeasurements;
    }

    public String getDisplayMeasurements() {
        return displayMeasurements;
    }


    /**
     * 状态：-2 下架，-1 缺货中，0 正常销售，1 新上市 2推荐
     */
    private short state;

    public void setState(short state) {
        this.state = state;
    }

    public short getState() {
        return state;
    }

    /**
     * 创建时间
     */
    private Date createTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", keywords='" + keywords + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productInitialNum=" + productInitialNum +
                ", productPrice=" + productPrice +
                ", displayMeasurements='" + displayMeasurements + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
