package com.katey268.web.dao;

import com.katey268.web.entity.Product;
import com.katey268.web.entity.ProductInfo;
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
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void insertProductInfo() throws Exception {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setImages("/imagesproductid10000000.jsp");
        productInfo.setDesigner("Eva Lilja Löwenhielm");
        productInfo.setPackageInfo("60x42x80");
        productInfo.setDocsFile("/temp/deml.doc");
        productInfo.setCareInst("不能水洗\n" + "用家具清洁剂清洗。\n" + "勿漂白\n" + "勿滚筒烘干\n" + "勿熨烫\n" + "勿干洗");
        productInfo.setCusMaterials("整体结构: 100%聚丙烯纤维\n" + "整体结构: 100%聚酯纤维\n" + "固定座: 聚氨酯泡沫30公斤/立方米, 填料：聚酯纤维\n" + "松垫: 50% 切块聚氨酯海绵/50%聚酯纤维\n" + "腿: 钢, 有色粉涂层");
        productInfo.setKeyFeatures("- 靠垫为您的背部提供舒适支撑，可双面使用，减少磨损。\n" + "- 您可以根据坐姿调整靠垫位置。\n" + "- 享有10年品质保证，详情请见质保手册。");
        int result=productInfoDao.insertProductInfo(productInfo);
        System.out.println("result:"+result);
    }

    @Test
    public void queryById() throws Exception {
        long productId=1000000L;
        ProductInfo productInfo;
        productInfo=productInfoDao.queryById(productId);
        System.out.println(productInfo);
    }

    @Test
    public void queryAllByDesigner() throws Exception {
        String designer="Eva Lilja Löwenhielm";
        List<ProductInfo>productInfos=productInfoDao.queryAllByDesigner(designer,1,1);
        System.out.println("productInfos");
    }

    @Test
    public void updateProductInfo() throws Exception {

    }

}