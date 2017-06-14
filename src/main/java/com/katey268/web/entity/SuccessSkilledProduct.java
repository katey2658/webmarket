package com.katey268.web.entity;

import java.util.Date;

/**
 * Created by 11456 on 2016/12/27.
 * 成功秒杀下的商品实体信息
 */
public class SuccessSkilledProduct {
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
     * 秒杀到商品的用户
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 状态：-1：无效 0：成功  1：付款
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

    /**
     * 秒杀的商品
     */
    private SeckillProduct seckillProduct;

    public void setSeckillProduct(SeckillProduct seckillProduct) {
        this.seckillProduct = seckillProduct;
    }

    public SeckillProduct getSeckillProduct() {
        return seckillProduct;
    }

    @Override
    public String toString() {
        return "SuccessSkilledProduct{" +
                "spId=" + spId +
                ", userId=" + userId +
                ", state=" + state +
                ", seckillProduct=" + seckillProduct +
                '}';
    }
}


