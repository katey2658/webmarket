package com.katey268.web.dao;

import com.katey268.web.entity.SuccessSkilledProduct;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 11456 on 2016/12/27.
 */
public interface SuccessSeckilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userId
     * @return 如果影响行数=1，表示更新记录行数
     */
    int insertSuccessSkilled(@Param("spId") long seckillId,@Param("userId") long userId);

    /**
     * 根据秒杀商品编号和用户Id来查看秒杀对象
     * @param spId
     * @param userId
     * @return
     */
    SuccessSkilledProduct queryByIdsWithSeckill(@Param("spId") long spId,@Param("userId")long userId);

    /**
     * 修改秒杀商品状态记录
     * @param spId
     * @param userId
     * @param state
     * @return
     */
    int updateSuccessSkilled(@Param("spId") long spId,
                             @Param("userId")long userId,
                             @Param("newState") short state);

}
