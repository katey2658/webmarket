package com.katey268.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 11456 on 2017/1/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CartProductDaoTest {

    @Autowired
    private CartProductDao cartProductDao;
    @Test
    public void insertCartProduct() throws Exception {

    }

    @Test
    public void batchInsertCartProduct() throws Exception {

    }

    @Test
    public void queryCartProductByUserId() throws Exception {

    }

    @Test
    public void updateCartProductList() throws Exception {

    }

    @Test
    public void deleteCartListByUserId() throws Exception {

    }

}