package com.katey268.web.dao;

import com.katey268.web.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public interface ActivityDao {

    /**
     * 添加一个活动
     * @param activity
     * @return
     */
    int insertActivity(Activity activity);

    /**
     * 根据活动编号查询
     * @param activityId
     * @return
     */
    Activity queryById(int activityId);

    /**
     * 查询所有的活动
     * @param offset
     * @param limit
     * @return
     */
    List<Activity> queryAll(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * 查询所有给定时间之前的
     * @param time
     * @param offset
     * @param limit
     * @return
     */
    List<Activity>  queryAllStartBeforeTime(@Param("time")Date time,
                                            @Param("offset")int offset,
                                            @Param("limit")int limit);

    /**
     * 查询所有还没有结束的活动
     * @param offset
     * @param limit
     * @return
     */
    List<Activity> queryAllBeforeEndTime(@Param("offset")int offset,
                                         @Param("limit")int limit);

    /**
     * 查询所有正在进行的活动
     * @param offset
     * @param limit
     * @return
     */
    List<Activity> queryAllAfterStartedAndNotEnd(@Param("offset")int offset,
                                                 @Param("limit")int limit);

    /**
     * 查询所有已经结束的活动
     * @param offset
     * @param limit
     * @return
     */
    List<Activity> queAllEnded(@Param("offset")int offset,
                               @Param("limit")int limit);
}
