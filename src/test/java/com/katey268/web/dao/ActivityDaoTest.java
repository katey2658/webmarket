package com.katey268.web.dao;

import com.katey268.web.entity.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2016/12/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ActivityDaoTest {

    @Autowired
    private ActivityDao activityDao;
    @Test
    public void insertActivity() throws Exception {
        Activity activity =new Activity();
        activity.setActivityTitle("你心目中的年度最佳产品");
        activity.setActivityDesc("为你心目中的年度最佳产品投上一票,有可能免费获得精美礼品一份");
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        int result=activityDao.insertActivity(activity);
        System.out.println("result:"+result);
    }

    @Test
    public void queryById() throws Exception {
        int activityId=1;
        Activity activity=activityDao.queryById(activityId);
        System.out.println("Activity:"+activity);

    }

    @Test
    public void queryAll() throws Exception {

    }

    @Test
    public void queryAllStartBeforeTime() throws Exception {

    }

    @Test
    public void queryAllBeforeEndTime() throws Exception {

    }

    @Test
    public void queryAllAfterStartedAndNotEnd() throws Exception {

    }

    @Test
    public void queAllEnded() throws Exception {

    }

}