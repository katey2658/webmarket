package com.katey268.web.dao;

import com.katey268.web.entity.ExpensesRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2017/1/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ExpensesRecordDaoTest {

    @Autowired
    private ExpensesRecordDao expensesRecordDao;
    @Test
    public void insertExpensesRecord() throws Exception {
        ExpensesRecord expensesRecord=new ExpensesRecord();
        expensesRecord.setPrice(79900);
        expensesRecord.setSale(false);
        expensesRecord.setNum(2);
        expensesRecord.setExpId(10000L);
        expensesRecord.setUserId(10000L);
        expensesRecord.setProductId(1000000L);
        expensesRecord.setTotal(159800);
        expensesRecord.setExpressCode(1);
        expensesRecord.setAddressId(1);
        int result=expensesRecordDao.insertExpensesRecord(expensesRecord);
        System.out.println("result:"+result);
    }

    @Test
    public void queryAllByUserId() throws Exception {
        long userId=10000L;
        List<ExpensesRecord>expensesRecords=expensesRecordDao.queryAllByUserId(userId,0,10);
        System.out.println("expensesRecords:"+expensesRecords);
    }

    @Test
    public void queryAllByProductId() throws Exception {
        long productId=1000000L;
        List<ExpensesRecord>expensesRecords=expensesRecordDao.queryAllByProductId(productId,0,10);
        System.out.println("expensesRecords:"+expensesRecords);
    }

    @Test
    public void queryAllByExpId() throws Exception {
        long expId=10000L;
        List<ExpensesRecord>expensesRecords=expensesRecordDao.queryAllByExpId(expId,0,10);
        System.out.println("expensesRecords:"+expensesRecords);
    }

    @Test
    public void updateStateByExpRecordId() throws Exception {
        short newState=-1;
        int  result=expensesRecordDao.updateStateByExpRecordId(1L,newState);
        System.out.println("result:"+result);
    }

    @Test
    public void updateNumByExpRecord() throws Exception {
        int newNum=3;
        int result=expensesRecordDao.updateNumByExpRecord(1L,newNum);
        System.out.println("result:"+result);
    }
}