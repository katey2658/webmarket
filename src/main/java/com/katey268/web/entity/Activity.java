package com.katey268.web.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public class Activity {
    /**
     * 活动标识ID
     */
    private int activityId;

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityId() {
        return activityId;
    }

    /**
     * 活动标识
     */
    private String activityTitle;

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * 活动描述
     */
    private String activityDesc;

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    /**
     * 是否公开
     */
    private boolean activityPublic;

    public void setActivityPublic(Boolean activityPublic) {
        this.activityPublic = activityPublic;
    }

    public boolean isActivityPublic() {
        return activityPublic;
    }

    /**
     * 每个用户的票数
     */
    private int activtyCount;

    public void setActivityPublic(boolean activityPublic) {
        this.activityPublic = activityPublic;
    }

    public int getActivtyCount() {
        return activtyCount;
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
     * 参与者
     */
    private List<Participartor> participartors;

    public void setParticipartors(List<Participartor> participartors) {
        this.participartors = participartors;
    }

    public List<Participartor> getParticipartors() {
        return participartors;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityTitle='" + activityTitle + '\'' +
                ", activityDesc='" + activityDesc + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", participartors=" + participartors +
                '}';
    }
}
