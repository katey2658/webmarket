package com.katey268.web.dao;

import com.katey268.web.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public interface ProductInfoDao {

    /**
     * 添加一个产品详细信息
     * @param productInfo
     * @return
     */
    int insertProductInfo(ProductInfo productInfo);

    /**
     * 根据编号来查找一个
     * @param productId
     * @return
     */
    ProductInfo queryById(long productId);

    /**
     * 查找所有关于该设计者的作品
     * @param designer
     * @param offset
     * @param limit
     * @return
     */
    List<ProductInfo> queryAllByDesigner(@Param("designer") String designer,
                                         @Param("offset") int offset,
                                         @Param("limit") int limit);

    /**
     * 更新产品信息
     * @param productInfo
     * @return
     */
    int updateProductInfo(ProductInfo productInfo);
}
