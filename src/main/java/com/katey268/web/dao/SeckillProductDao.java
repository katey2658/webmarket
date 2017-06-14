package com.katey268.web.dao;

import com.katey268.web.entity.SeckillProduct;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by 11456 on 2016/12/27.
 */
public interface SeckillProductDao {

    /**
     * 添加一个秒杀商品
     * @param spId
     * @param initialNum
     * @param seckillPrice
     * @param startTime
     * @param endTime
     * @return
     */
     int addSeckill(@Param("spId") long spId,
                   @Param("initialNum") int initialNum,
                   @Param("seckillPrice") int seckillPrice,
                   @Param("satrtTime")Date startTime,
                   @Param("endTime")Date endTime);

    /**
     * 减去库存
     * @param spId
     * @param seckillTime
     * @return 如果影响行数>=1,表示更新记录行数
     */
     int reduceNumber (@Param("spId") long spId, @Param("seckillTime")Date seckillTime);

    /**
     * 根据id值查询秒杀对象
     * @param spId
     * @return
     */
     SeckillProduct queryById(long spId);

    /**
     * 根据偏移量来查询秒杀商品数量
     * @param offset
     * @param limit
     * @return
     */
     List<SeckillProduct> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 修改一个秒杀活动的时间（一般情况下不允许操作）
     * @param spId
     * @param newStartTime
     * @param newEndTime
     * @return
     */
     int updateSeckillTimeById(@Param("spId") long spId,
                          @Param("newStartTime")Date newStartTime,
                          @Param("newEndTime")Date newEndTime);

    /**
     * 修改一个秒杀活动的价格（一般不允许操作）
     * @param spId
     * @param newPrice
     * @return
     */
     int updateSeckillPriceById(@Param("spId")long spId,
                           @Param("newPrice")int newPrice);

    /**
     * 修改一个秒杀活动的商品数量（一般不允许操作）
     * @param spId
     * @param newInitialNum
     * @return
     */
     int updateSeckillInitialNumById(@Param("spId")long spId,
                                    @Param("newInitialNum")long newInitialNum);

    /**
     * 删除一个秒杀活动信息（不允许操作）
     * @param spId
     * @return
     */
     int deleteSeckillById(@Param("spId")long spId);

}
