package com.katey268.web.entity;

/**
 * Created by 11456 on 2016/12/30.
 * 参与者
 */
public class Participartor {
    /**
     * 参与活动的编号
     */
    private long participartorId;

    public void setParticipartorId(long participartorId) {
        this.participartorId = participartorId;
    }

    public long getParticipartorId() {
        return participartorId;
    }

    /**
     * 参与活动编号
     */
    private int activityId;

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityId() {
        return activityId;
    }

    /**
     * 活动参与者
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return  userId;
    }

    /**
     * 参与产品编号
     */
    private long productId;

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    /**
     * 参与者口号
     */
    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 图片
     */
    private String image;

    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    /**
     * 票数
     */
    private int count ;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Participartor{" +
                "activityId=" + activityId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", count=" + count +
                '}';
    }
}
