package com.katey268.web.dao;

import com.katey268.web.entity.Express;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2017/1/1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ExpressDaoTest {

    @Autowired
    private ExpressDao expressDao;
    @Test
    public void insertExpress() throws Exception {
        Express express=new Express();
        express.setAddressId(330683);
        express.setPrice(100);
        express.setWeight(500);
        int result=expressDao.insertExpress(express);
        System.out.println("result"+result);
    }

    @Test
    public void queryByExpressCode() throws Exception {
        long expressCode=1L;
        Express express=expressDao.queryByExpressCode(expressCode);
        System.out.println("express:"+express);
    }

    @Test
    public void updateStateByExpressCode() throws Exception {
        long expressCode=1L;
        short newState=-1;
        int result=expressDao.updateStateByExpressCode(expressCode,newState);
        System.out.println("result"+result);
    }

    @Test
    public void updateExpress() throws Exception {
        Express express=new Express();
        express.setExpressCode(1L);
        express.setAddressId(330683);
        express.setPrice(100);
        express.setWeight(500);
        int result=expressDao.updateExpress(express);
        System.out.println("result"+result);
    }

}