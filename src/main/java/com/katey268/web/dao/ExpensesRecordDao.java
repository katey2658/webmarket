package com.katey268.web.dao;

import com.katey268.web.entity.ExpensesRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */

public interface ExpensesRecordDao {

    /**
     * 添加一条消费记录
     * @param expensesRecord
     * @return
     */
    int insertExpensesRecord(ExpensesRecord expensesRecord);

    /**
     * 查询所有关于一个用户的购买记录
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<ExpensesRecord> queryAllByUserId(@Param("userId") long userId,
                                          @Param("offset") int offset,
                                          @Param("limit") int limit);

    /**
     * 根据商品编号，查询所有关于商品的购买记录
     * @param productId
     * @param offset
     * @param limit
     * @return
     */
    List<ExpensesRecord> queryAllByProductId(@Param("productId")long productId,
                                             @Param("offset")int offset,
                                             @Param("limit")int limit);

    /**
     * 根据购物清单编号来查询所有购买的记录
     * @param expId
     * @param offset
     * @param limit
     * @return
     */
    List<ExpensesRecord> queryAllByExpId(@Param("expId")long expId,
                                         @Param("offset")int offset,
                                         @Param("limit")int limit);

    /**
     * 根据消费记录编号差查询
     * @param expRecordId
     * @return
     */
    ExpensesRecord queryByExpRecordId(long expRecordId);

    /**
     * 修改消费记录状态
     * @param expRecordId
     * @param newState
     * @return
     */
    int updateStateByExpRecordId(@Param("expRecordId")long expRecordId,
                           @Param("newState")short newState);

    /**
     * 修改购买数量
     * @param expRecordId
     * @param newNum
     * @return
     */
    int updateNumByExpRecord(@Param("expRecordId")long expRecordId,
                             @Param("newNum")int newNum);

}
