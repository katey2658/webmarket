package com.katey268.web.dao;

import com.katey268.web.entity.CartProduct;

import java.util.List;

/**
 * Created by 11456 on 2017/1/2.
 * 关于购物车的列表
 */
public interface CartProductDao {

    /**
     * 插入一个购物车信息
     * @param CartProduct
     * @return
     */
    int insertCartProduct(CartProduct CartProduct);

    /**
     * 批量插入数据
     * @param productList
     * @return
     */
    int batchInsertCartProduct(List<CartProduct> productList);

    /**
     * 根据用户编号获取相关购物车信息
     * @param userId
     * @return
     */
    List<CartProduct> queryCartProductByUserId(long userId);

    /**
     * 批量更新
     * @param newRoductList
     * @return
     */
    int updateCartProductList(List<CartProduct> newRoductList);

    /**
     * 删除数据库中原有购物车信息
     * @param userId
     * @return
     */
    int deleteCartListByUserId(long userId);
}
