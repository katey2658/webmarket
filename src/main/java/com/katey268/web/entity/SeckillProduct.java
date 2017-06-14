package com.katey268.web.entity;

import java.util.Date;

/**
 * Created by 11456 on 2016/12/27.
 * 秒杀商品信息实体
 */
public class SeckillProduct{

    /**
     * 秒杀商品编号
     */
    private long spId;

    public void setSpId(long spId) {
        this.spId = spId;
    }

    public long getSpId() {
        return spId;
    }

    /**
     * 对应商品信息
     */
    private ProductInfo productInfo;

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * 秒杀商品主题
     */
    private String spTitle;

    public void setSpTitle(String spTitle) {
        this.spTitle = spTitle;
    }

    public String getSpTitle() {
        return spTitle;
    }

    /**
     * 秒杀价格（单位为分）
     */
    private int spPrice;

    public void setSpPrice(int spPrice) {
        this.spPrice = spPrice;
    }

    public int getSpPrice() {
        return spPrice;
    }

    /**
     * 数量
     */
    private int spNum;

    public void setSpNum(int spNum) {
        this.spNum = spNum;
    }

    public int getSpNum() {
        return spNum;
    }

    /**
     * 开始时间
     */
    private Date startTime;

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    /**
     * 结束时间
     */
    private Date endTime;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
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


    /**
     * 重写toString方法，然后显示秒杀所有信息
     * @return
     */
    @Override
    public String toString() {
        return "SeckillProduct{" +
                "spId=" + spId +
                ", productInfo=" + productInfo +
                ", spTitle='" + spTitle + '\'' +
                ", spPrice=" + spPrice +
                ", spNum=" + spNum +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
