package com.katey268.web.service;

import com.katey268.web.dto.CartStoreExecution;
import com.katey268.web.dto.PurchaseExecution;
import com.katey268.web.entity.CartProduct;
import com.katey268.web.entity.Product;
import com.katey268.web.entity.ProductInfo;
import com.katey268.web.exception.*;

import java.util.List;

/**
 * Created by 11456 on 2017/1/1.
 */
public interface ProductService {

    /**
     * 获取商品列表
     * @return
     */
    List<Product> getProductList(String type,int page)
            throws AccessException,ArgumentException,ResourceNotFoundException,ResourceReadException;;

    /**
     * 根据关键词来获取产品列表
     * @param keywords
     * @return
     */
    List<Product> getProductListByKeywords(String keywords);

    /**
     * 根据商品编号来查询商品详细信息
     * @param productId
     * @return
     * @throws AccessException
     * @throws ResourceNotFoundException
     * @throws ResourceReadException
     */
    ProductInfo getProductInfoById(long productId)
            throws AccessException,ResourceNotFoundException,ResourceReadException;

    /**
     * 执行购买流程
     * @param cartProductList 购买的商品
     * @return 购买结果
     * @throws StackoutException
     * @throws PayFailedException
     * @throws StackoutException
     * @throws ProductAccessException
     */
    PurchaseExecution executePurchase(List<CartProduct> cartProductList)throws
            PurchaseException,PayFailedException,StackoutException,ProductAccessException;

    /**
     * 将购物车中的信息保存到到数据中
     * @param cartProductList
     * @return
     */
    CartStoreExecution executeCartProductStore(List<CartProduct> cartProductList);

    /**
     * 将购物车商品信息从数据库中取出
     * @param userId
     * @return
     */
    List<CartProduct> getCartProductList(long userId);
}
