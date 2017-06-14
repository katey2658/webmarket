package com.katey268.web.dto;

import com.katey268.web.entity.Product;
import com.katey268.web.enums.PurchaseStateEnum;

import java.util.List;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 封装购买之后结果
 */
public class PurchaseExecution {

    /**
     * 购买商品编号列表
     */
    private List<Long> productIdList;

    /**
     * 购买状态结果
     */
    private int state;

    /**
     * 状态表示
     */
    private String stateInfo;

    /**
     * 购买后的商品列表
     */
    private List<Product> productList;

    /**
     * @param productIdList
     * @param stateEnum
     * @param stateInfo
     * @param productList
     */
    public PurchaseExecution(List<Long> productIdList, PurchaseStateEnum stateEnum, String stateInfo, List<Product> productList) {
        this.productIdList = productIdList;
        this.state = state;
        this.stateInfo = stateInfo;
        this.productList = productList;
    }

    /**
     *
     * @param productIdList
     * @param stateEnum
     * @param productList
     */
    public PurchaseExecution(List<Long> productIdList, PurchaseStateEnum stateEnum, List<Product> productList) {
        this.productIdList = productIdList;
        this.state = state;
        this.productList = productList;
    }

    /**
     * @param productIdList
     * @param stateEnum
     */
    public PurchaseExecution(List<Long> productIdList, PurchaseStateEnum stateEnum) {
        this.productIdList = productIdList;
        this.state = state;
    }
}
