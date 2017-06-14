package com.katey268.web.dao;

import com.katey268.web.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public interface AddressDao {
    /**
     * 添加一个用户收货地址
     * @param address
     * @return
     */
    int insertAddress(Address address);

    /**
     * 查询一个用户的所有收货地址
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<Address> queryAllByUserId(@Param("userId") long userId,
                                   @Param("offset")int offset,
                                   @Param("limit") int limit);

    /**
     * 修改一个收货信息
     * @param newAddress
     * @return
     */
    int updateAddress(Address newAddress);

}
