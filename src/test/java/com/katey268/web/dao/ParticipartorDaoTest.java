package com.katey268.web.dao;

import com.katey268.web.entity.Participartor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2016/12/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ParticipartorDaoTest {

    @Autowired
    private ParticipartorDao participartorDao;

    @Test
    public void insertParticipartor() throws Exception {
        Participartor participartor=new Participartor();
        participartor.setActivityId(0);
        participartor.setUserId(1000);
        participartor.setImage("/images/UserId10000vote.jsp");
        participartor.setDesc("青春，就要活的精彩");
        int result=participartorDao.insertParticipartor(participartor);
        System.out.println("result:"+result);
    }


    @Test
    public void queryAllByActivityId() throws Exception {
        int activityId=0;
        List<Participartor> participartors=participartorDao.queryAllByActivityId(activityId,00,1);
        System.out.println("participartors:"+participartors);
    }

    @Test
    public void queryAllActivityIdsByUserId() throws Exception {
        long userId=1000L;
        List<Integer> acativityIds=participartorDao.queryAllActivityIdsByUserId(1000L,0,1);
        System.out.println("participartors:"+acativityIds);
    }

    @Test
    public void queryAllActivityIdsByProductId() throws Exception {

    }

    @Test
    public void updateUserImage() throws Exception {
        long participartorId=1;
        String newImage="/iamges/participartoruser1000.jpg";
        int result =participartorDao.updateUserImage(participartorId,newImage);
        System.out.println("result:"+result);
    }

    @Test
    public void updateDesc() throws Exception {
        long participartorId=1;
        String newDesc="青春，就要活的自由";
        int result =participartorDao.updateDesc(participartorId,newDesc);
        System.out.println("result:"+result);
    }

    @Test
    public void increaseCountNum() throws Exception {
        long participartorId=1;
        int result =participartorDao.increaseCountNum(participartorId,3);
        System.out.println("result:"+result);
    }

}