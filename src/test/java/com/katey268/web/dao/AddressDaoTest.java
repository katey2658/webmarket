package com.katey268.web.dao;

import com.katey268.web.entity.Address;
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
public class AddressDaoTest {

    @Autowired
    private AddressDao addressDao;
    @Test
    public void insertAddress() throws Exception {
        Address address=new Address();
        address.setUserId(10000L);
        address.setConsigneeName("王东 ");
        address.setContractTel("15951765128");
        address.setGeocodeId(1000L);
        address.setAddress("江宁区南京晓庄学院3306");
        int result=addressDao.insertAddress(address);
        System.out.println("result:"+result);
    }



    @Test
    public void queryAByUserId() throws Exception {
        long userId=10000L;
        List<Address> addresses=addressDao.queryAllByUserId(userId,0,10);
        System.out.println("addresses:"+addresses);
    }

    @Test
    public void updateAddress() throws Exception {
        Address address=new Address();
        address.setAddressId(1);
        address.setUserId(10000L);
        address.setConsigneeName("王东");
        address.setContractTel("15951765128");
        address.setGeocodeId(330683L);
        address.setAddress("嵊州市黄泽中学");
        int result=addressDao.updateAddress(address);
        System.out.println("result:"+result);

    }

}