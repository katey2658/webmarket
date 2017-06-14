package com.katey268.web.entity;

import java.util.Date;

/**
 * Created by 11456 on 2017/1/2.
 * 活动投票记录
 */
public class ActivityVote {

    /**
     * 关于的活动
     */
    private int activityId;
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityId() {
        return activityId;
    }

    /**
     * 投票用户编号
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 操作IP
     */
    private String operateIp;

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }

    public String getOperateIp() {
        return operateIp;
    }

    /**
     * 时间
     */
    private Date createTime;
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
