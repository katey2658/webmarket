package com.katey268.web.dao;

import com.katey268.web.entity.Participartor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public interface ParticipartorDao {
    /**
     * 插入一个活动参与者
     * @param participartor
     * @return
     */
    int insertParticipartor(Participartor participartor);


    /**
     * 根据参与者编号来查询寻
     * @param participartor
     * @return
     */
    Participartor queryById(long participartor);

    /**
     * 查找一场活动所有的参与者
     * @param activityId
     * @param offset
     * @param limit
     * @return
     */
    List<Participartor> queryAllByActivityId(@Param("activityId") int activityId,
                                             @Param("offset")int offset,
                                             @Param("offset")int limit);

    /**
     * 根据用户Id来查找关于这个用户参加的所有活动
     * @param userId
     * @return
     */
    List<Integer>  queryAllActivityIdsByUserId(@Param("userId") long userId,
                                                @Param("offset")int offset,
                                                @Param("limit")int limit);

    /**
     * 根据产品编号来查询相关活动
     * @param productId
     * @return
     */
    List<Integer>  queryAllActivityIdsByProductId(@Param("productId") long productId,
                                                  @Param("offset")int offset,
                                                  @Param("limit")int limit);

    /**
     * 修改参与用户的图片
     * @param participartorId
     * @param newImage
     * @return
     */
    int updateUserImage(@Param("participartorId") long participartorId,
                        @Param("newImage")String newImage);

    /**
     * 修改参与者的口号
     * @param participartorId
     * @param newDesc
     * @return
     */
    int updateDesc(@Param("participartorId") long participartorId,
                   @Param("newDesc")String newDesc);

    /**
     * 为该参与者投一票,增加票数
     * @param participartorId
     * @return
     */
    int increaseCount(long participartorId);

    /**
     * 为该参与者添加多个票数
     * @param participartorId
     * @param num
     * @return
     */
    int increaseCountNum(@Param("participartorId") long participartorId,
                      @Param("num")int  num);

}
