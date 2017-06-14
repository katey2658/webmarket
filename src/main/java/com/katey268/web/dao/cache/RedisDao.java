package com.katey268.web.dao.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisPool;

/**
 * Created by 11456 on 2016/12/27.
 */
public class RedisDao {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    private JedisPool jedisPool;

    public  RedisDao(String ip,int port){
        jedisPool=new JedisPool(ip,port);
    }
}
