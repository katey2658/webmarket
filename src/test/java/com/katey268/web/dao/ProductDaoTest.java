package com.katey268.web.dao;

import com.katey268.web.entity.Product;
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
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;
    @Test
    public void insertProduct() throws Exception {
        Product product=new Product();
        product.setKeywords("单人沙发/扶手椅, 斯科特伯 米黄色");
        product.setProductTitle("伊克尔");
        product.setProductInitialNum(100);
        product.setProductImage("/images/imageeproduc1000000.jpp");
        product.setProductPrice(79900);
        product.setDisplayMeasurements("70x73x75");
        int result=productDao.insertProduct(product);
        System.out.println("result:"+result);
    }

    @Test
    public void updateProduct() throws Exception {
        Product product=new Product();
        product.setProductId(1000000L);
        product.setKeywords("单人沙发/扶手椅");
        product.setProductTitle("伊克尔");
        product.setProductInitialNum(120);
        product.setProductImage("/images/imageeproduc1000000.jpp");
        product.setProductPrice(79900);
        product.setState((short)0);
        product.setDisplayMeasurements("70x73x75");
        int result=productDao.updateProduct(product);
        System.out.println(result);
    }

    @Test
    public void queryById() throws Exception {
        long productId=1000000L;
        Product product;
        product=productDao.queryById(productId);
        System.out.println(product);
    }

    @Test
    public void queryAll() throws Exception {
        List<Product> products;
        products=productDao.queryAll(0,1);
        System.out.println("products:"+products);
    }

    @Test
    public void updateProductStateById() throws Exception {
        long productId=1000000L;
        short state=-1;
        int result=productDao.updateProductStateById(productId,state);
    }

    @Test
    public void increaseProductNum() throws Exception {
        long productId=1000000L;
        int increaseNum=30;
        int result=productDao.increaseProductNum(productId,increaseNum);
    }

    @Test
    public void reduceProductNum() throws Exception {
        long productId=1000000L;
        int reduceNum=3;
        int result=productDao.reduceProductNum(productId,reduceNum);
    }

}