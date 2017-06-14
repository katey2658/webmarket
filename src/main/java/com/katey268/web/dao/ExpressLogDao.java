package com.katey268.web.dao;

import com.katey268.web.entity.Express;
import com.katey268.web.entity.ExpressLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public interface ExpressLogDao {
    /**
     * 添加一条快递运行记录
     * @param expressLog
     * @return
     */
    int insertExpressLog(ExpressLog expressLog);

    /**
     * 根据快递单来查询快递记录
     * @param expressCode
     * @return
     */
    List<ExpressLog> queryAllByExpressCode(@Param("expressCode") long expressCode,
                                           @Param("offset")int offset,
                                           @Param("limit")int limit);

}
