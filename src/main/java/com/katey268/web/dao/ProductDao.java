package com.katey268.web.dao;

import com.katey268.web.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 11456 on 2016/12/27.
 */
public interface ProductDao {

    /**
     * 向数据库添加一个商品信息记录
     * @param product
     * @return
     */
    int insertProduct(Product product);

    /**
     * 提供所有信息的修改
     * @param product
     * @return
     */
    int updateProduct(Product product);

    /**d
     * 根据Id来查找
     * @param productId
     * @return
     */
    Product queryById(@Param("productId")long productId);

    /**
     * 根据偏移量来查询商品
     * @param offset
     * @param limit
     * @return
     */
    List<Product> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 依据商品类型来查询
     * @param productType
     * @param offset
     * @param limit
     * @return
     */
    List<Product> queryAllByType(@Param("productType") String productType,
                           @Param("offset") int offset,
                           @Param("limit") int limit);

    /**
     * 改变商品的状态
     * @param productId
     * @param newState
     * @return
     */
    int updateProductStateById(@Param("productId") Long productId,
                               @Param("newState") short newState);

    /**
     * 为商品数添加特定数量
     * @param productId
     * @param increaseNum
     * @return
     */
    int increaseProductNum(@Param("productId") long productId,
                           @Param("increaseNum")int increaseNum);
    /**
     * 为商品数减去特定数量（比如需要参加一个秒杀活动）
     * @param productId
     * @param reduceNum
     * @return
     */
    int reduceProductNum(@Param("productId") long productId,
                           @Param("reduceNum")int reduceNum);

}
