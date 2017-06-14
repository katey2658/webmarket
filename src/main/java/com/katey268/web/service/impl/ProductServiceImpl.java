package com.katey268.web.service.impl;

import com.katey268.web.dao.CartProductDao;
import com.katey268.web.dao.ExpensesRecordDao;
import com.katey268.web.dao.ProductDao;
import com.katey268.web.dao.ProductInfoDao;
import com.katey268.web.dto.CartStoreExecution;
import com.katey268.web.dto.PurchaseExecution;
import com.katey268.web.entity.CartProduct;
import com.katey268.web.entity.ExpensesRecord;
import com.katey268.web.entity.Product;
import com.katey268.web.entity.ProductInfo;
import com.katey268.web.exception.*;
import com.katey268.web.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 提供商品相关的服务
 */

@Service
public class ProductServiceImpl implements ProductService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    /**
     * 注入产品表
     */
    @Autowired
    private ProductDao productDao;

    /**
     * 注入商品详细表
     */
    @Autowired
    private ProductInfoDao productInfoDao;

    /**
     * 注入购物车表
     */
    @Autowired
    private CartProductDao cartProductDao;
    /**
     * 注入消费记录表
     */
    @Autowired
    private ExpensesRecordDao expensesRecordDao;

    /**
     * 获取某个类型所有商品
     * @param type
     * @param page
     * @return
     * @throws AccessException
     * @throws ResourceNotFoundException
     * @throws ResourceReadException
     */
    public List<Product> getProductList(String type,int page)
            throws AccessException,ArgumentException,ResourceNotFoundException,ResourceReadException {
        List<Product> productList=null;
        try{
            if (type.isEmpty()||!(page>=1)){
                throw new ArgumentException("输入参数不合法");
            }
            try{
                productList=productDao.queryAllByType(type,page,20);
            }catch (Exception e){
                //在读取商品的时候发生错误
                logger.info(e.getMessage(),e);
                throw new ResourceReadException("商品列表读取错误");
            }
            if (productList==null){
                throw new ResourceNotFoundException("商品数据列表不存在数据");
            }
        }catch (ArgumentException e){
            throw e;
        } catch (ResourceReadException e){
            throw e;
        }catch (ResourceNotFoundException e){
            throw e;
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            throw  new AccessException("访问商品列表发生错误:"+e.getMessage());
        }
        return productList;
    }

    /**
     * 根据关键词获取所有商品
     * @param keywords
     * @return
     */
    public List<Product> getProductListByKeywords(String keywords) {
        return null;
    }

    /**
     * 根据产品编号获取产品详细信息
     * @param productId
     * @return
     */
    public ProductInfo getProductInfoById(long productId)
            throws AccessException,ResourceNotFoundException,ResourceReadException {
        ProductInfo productInfo=null;
        try{
            try{
                productInfoDao.queryById(productId);
            }catch (Exception e){
                //在读取相关数据的时候发生异常
                logger.info(e.getMessage(),e);
                throw new ResourceReadException("在读取数据时候发生异常");
            }
            if (productInfo==null){
                //商品信息不存在,抛出资源没找到异常异常
                throw new ResourceNotFoundException("商品信息不存在");
            }
        }catch (ResourceReadException e){
            throw e;
        }catch (ResourceNotFoundException e){
            throw e;
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            throw new AccessException("GetProductInfo inner error:"+e.getMessage());
        }
        return productInfo;
    }

    /**
     * 执行购买操作，返回购买结果
     * @param cartProductList 购买的商品
     * @return
     * @throws PurchaseException
     * @throws PayFailedException
     * @throws StackoutException
     * @throws ProductAccessException
     */
    public PurchaseExecution executePurchase(List<CartProduct> cartProductList) throws PurchaseException, PayFailedException, StackoutException, ProductAccessException {


        return null;
    }

    /**
     * 购物车商品信息存储
     * @param cartProductList
     * @return
     */
    public CartStoreExecution executeCartProductStore(List<CartProduct> cartProductList) {
        return null;
    }

    /**
     * 获取购物车商品信息
     * @param userId
     * @return
     */
    public List<CartProduct> getCartProductList(long userId) {
        return null;
    }
}
