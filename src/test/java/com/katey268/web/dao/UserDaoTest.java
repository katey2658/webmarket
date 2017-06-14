package com.katey268.web.dao;

import com.katey268.web.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2016/12/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void insertUser() throws Exception {
        User user=new User();
        user.setUserName("katey2659");
        user.setUserMail("katey2658@foxmail.com");
        user.setUserPwd("wd1996");
        user.setUserTel("15951765129");

        int resultCode=userDao.insertUser(user);
        System.out.println(resultCode);
    }

    @Test
    public void queryById() throws Exception {
        User user;
        user=userDao.queryById(10000L);
        System.out.println(user);
    }


    @Test
    public void queryByName() throws Exception {
        User user;
        user = userDao.queryByName("katey2659");
        System.out.println(user);
    }

    @Test
    public void queryByTel() throws Exception {
        User user;
        user=userDao.queryByTel("15951765128");
        System.out.println(user);
    }

    @Test
    public void queryByMail() throws Exception {
         User user;
         user=userDao.queryByMail("1145690747@qq.com");
         System.out.println(user);
    }

    @Test
    public void updateMailById() throws Exception {
         long  id=10002L;
         String newUserMail="katey268@gmail.com";
         int result=userDao.updateMailById(id,newUserMail);
         User user;
         user=userDao.queryById(id);
         System.out.println(user);
    }

    @Test
    public void updateTelById() throws Exception {

    }

    @Test
    public void updatePhotoById() throws Exception {
        Long id = 10002L;
        String userPhoto = "/images/user10002photo.jpg";
        int result = userDao.updatePhotoById(id, userPhoto);
        User user;
        user = userDao.queryById(id);
        System.out.println(user);
    }

     @Test
     public void updatePwdById() throws Exception {

}    }