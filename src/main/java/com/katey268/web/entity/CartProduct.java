package com.katey268.web.entity;

/**
 * Created by 11456 on 2017/1/2.
 */
public class CartProduct {

    /**
     * 无参构造
     */
    public CartProduct(){

    }

    /**
     * 全参构造
     * @param userId
     * @param productId
     * @param num
     * @param addressId
     */
    public CartProduct(long userId, long productId, int num, long addressId) {
        this.userId = userId;
        this.productId = productId;
        this.num = num;
        this.addressId = addressId;
    }

    /**
     * 用户编号
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 商品编号
     */
    private long productId;

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    /**
     * 数量
     */
    private int num;
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    /**
     * 收货地址信息
     */
    private long addressId;
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getAddressId() {
        return addressId;
    }

    /**
     * 关于产品
     */
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
