package com.katey268.web.dao;

import com.katey268.web.entity.Express;
import org.apache.ibatis.annotations.Param;


/**
 * Created by 11456 on 2016/12/30.
 */
public interface ExpressDao {

    /**
     * 添加一条快递单
     * @param express
     * @return
     */
    int insertExpress(Express express);

    /**
     * 查询一条快递单
     * @param expressCode
     * @return
     */
    Express queryByExpressCode(long expressCode);

    /**
     * 修改快递状态
     * @return
     */
    int updateStateByExpressCode(@Param("expressCode") long expressCode,
                                 @Param("newState")short newState);

    /**
     * 修改快递单信息
     * @param newExpress
     * @return
     */
    int updateExpress(Express newExpress);

}
