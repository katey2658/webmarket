package com.katey268.web.dao;

import com.katey268.web.entity.ExpressLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2017/1/1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ExpressLogDaoTest {

    @Autowired
    private ExpressLogDao expressLogDao;
    @Test
    public void insertExpressLog() throws Exception {
        ExpressLog expressLog=new ExpressLog(1L,new Date(),"快递已经接收");
        int result=expressLogDao.insertExpressLog(expressLog);
        System.out.println("result:"+result);
    }

    @Test
    public void queryAllByExpressCode() throws Exception {
        long expressCode=1L;
        List<ExpressLog> expressLogs=expressLogDao.queryAllByExpressCode(expressCode,0,10);
        System.out.println("expressLogs:"+expressLogs);
    }
}