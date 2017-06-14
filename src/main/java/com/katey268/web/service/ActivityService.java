package com.katey268.web.service;

import com.katey268.web.dto.ActivityExposer;
import com.katey268.web.dto.VoteExecution;
import com.katey268.web.entity.Activity;
import com.katey268.web.entity.Participartor;

import java.util.List;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 关于活动相关
 */
public interface ActivityService {
    /**
     * 活动投票：对所有人开放
     * @param activityId
     * @param participartorId
     * @param fromIp
     * @return
     */
    VoteExecution vote(int activityId,long participartorId,String fromIp);

    /**
     * 活动投票：对注册用户开发
     * @param activityId
     * @param participartorId
     * @param userId
     * @return
     */
    VoteExecution vote(int activityId,long participartorId,long  userId);

    /**
     * 根据活动编号获取所有参与者
     * @param activityId
     * @return
     */
    List<Participartor> getParticipartorListByActivityId(int activityId);

    /**
     * 获取活动列表
     * @return
     */
    List<Activity> getActivityList();

    /**
     * 暴露活动地址
     */
    ActivityExposer getActivityByActivityId(int activityId);
}
