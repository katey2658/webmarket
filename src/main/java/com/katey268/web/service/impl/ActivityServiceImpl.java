package com.katey268.web.service.impl;

import com.katey268.web.dao.ActivityDao;
import com.katey268.web.dao.ActivityVoteDao;
import com.katey268.web.dao.ParticipartorDao;
import com.katey268.web.dto.ActivityExposer;
import com.katey268.web.dto.VoteExecution;
import com.katey268.web.entity.Activity;
import com.katey268.web.entity.ActivityVote;
import com.katey268.web.entity.Participartor;
import com.katey268.web.enums.VoteStateEnum;
import com.katey268.web.exception.ResourceNotFoundException;
import com.katey268.web.exception.ResourceReadException;
import com.katey268.web.exception.ResourceWriteException;
import com.katey268.web.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 提供关于活动的服务接口
 */

@Service
public class ActivityServiceImpl implements ActivityService{
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ActivityDao activityDao;
    @Autowired
    private ActivityVoteDao activityVoteDao;
    @Autowired
    ParticipartorDao participartorDao;

    /**
     * 投票来自某一个陌生用户，监测投票IP
     * @param activityId
     * @param participartorId
     * @param fromIp
     * @return
     */
    @Override
    public VoteExecution vote(int activityId, long participartorId, String fromIp) {
        Activity activity=null;
        try{
            try{
                //查询活动
                activity=activityDao.queryById(activityId);
            }catch (Exception e){
                logger.info(e.getMessage(),e);
                throw new ResourceReadException("在查询活动过程中异常："+e.getMessage());
            }
            if (activity==null){
                throw new ResourceNotFoundException("所访问资源并不存在");
            }
            int count=activityVoteDao.queryIpVoteCountByActivityIdAndTime(activityId,fromIp,new Date());
            if (count>=activity.getActivtyCount()){
                //已经超过规定次数了,投票失败
                return new VoteExecution(participartorId,VoteStateEnum.VOTE_OVERTIME);
            }
            ActivityVote activityVote=new ActivityVote();
            activityVote.setActivityId(activityId);
            activityVote.setOperateIp(fromIp);
            activityVoteDao.insertActivityVote(activityVote);
            //增加票数
            int result=participartorDao.increaseCount(participartorId);
            if (result<1) {
                //插入IP投票活动记录失败
                throw new ResourceWriteException();
            }else {
                //投票成功
                Participartor participartor=participartorDao.queryById(participartorId);
                return new VoteExecution(participartorId, VoteStateEnum.SUCCESS,participartor);
            }
        }catch (ResourceReadException e){
            throw e;
        }catch (ResourceNotFoundException e){
            throw e;
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            throw e;
        }
    }

    /**
     * 投票来自已经注册过的用户
     * @param activityId
     * @param participartorId
     * @param userId
     * @return
     */
    @Override
    public VoteExecution vote(int activityId, long participartorId, long userId) {
        return null;
    }

    /**
     * 获取一场活动的所有参与者
     * @param activityId
     * @return
     */
    @Override
    public List<Participartor> getParticipartorListByActivityId(int activityId) {
        return null;
    }

    /**
     * 获取所有的活动
     * @return
     */
    @Override
    public List<Activity> getActivityList() {
        return null;
    }

    /**
     * 获取关于活动的暴露口
     * @param activityId
     * @return
     */
    @Override
    public ActivityExposer getActivityByActivityId(int activityId) {
        return null;
    }
}
