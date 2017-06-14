package com.katey268.web.dao;

import com.katey268.web.entity.ActivityVote;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Created by 11456 on 2017/1/2.
 */
public interface ActivityVoteDao {

    /**
     * 插入一条记录
     * @param activityVote
     * @return
     */
    int insertActivityVote(ActivityVote activityVote);

    /**
     * 查询投票是否有效
     * @param activityId
     * @param operateIp
     * @param time
     * @return
     */
    int queryIpVoteCountByActivityIdAndTime(@Param("activityId") int activityId,
                                            @Param("operateIp") String operateIp,
                                            @Param("time")Date time);
}
