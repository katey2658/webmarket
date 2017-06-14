package com.katey268.web.entity;

/**
 * Created by 11456 on 2016/12/30.
 * 消费记录类
 */
public class ExpensesRecord {

    /**
     * 消费记录编号
     */
    private long expRecordId;

    public void setExpRecordId(long expRecordId) {
        this.expRecordId = expRecordId;
    }

    public long getExpRecordId() {
        return expRecordId;
    }

    /**
     * 消费记录清单编号
     */
    private long expId;
    public void setExpId(long expId) {
        this.expId = expId;
    }
    public long getExpId() {
        return expId;
    }


    /**
     * 购买者用户编号
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 产品编号
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
     * 价格
     */
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    /**
     * 是否促销
     */
    private Boolean sale;

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public Boolean getSale() {
        return sale;
    }

    /**
     * 折扣（小数点后两位）
     */
    private short discount;

    public void setDiscount(short discount) {
        this.discount = discount;
    }

    public short getDiscount() {
        return discount;
    }

    /**
     * 总价钱
     */
    private int total;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    /**
     * 状态
     */
    private short state;

    public void setState(short state) {
        this.state = state;
    }

    public short getState() {
        return state;
    }


    /**
     * 收货地址编号
     */
    private long addressId;

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getAddressId() {
        return addressId;
    }


    /**
     * 地址信息
     */
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    /**
     * 快递编码信息
     */
    private long expressCode;

    public void setExpressCode(long expressCode) {
        this.expressCode = expressCode;
    }

    public long getExpressCode() {
        return expressCode;
    }

    /**
     * 快递信息
     */
    private Express express;
    public void setExpress(Express express) {
        this.express = express;
    }
    public Express getExpress() {
        return express;
    }

    @Override
    public String toString() {
        return "ExpensesRecord{" +
                "expId=" + expId +
                ", productId=" + productId +
                ", num=" + num +
                ", price=" + price +
                ", sale=" + sale +
                ", discount=" + discount +
                ", total=" + total +
                ", state=" + state +
                ", address=" + address +
                ", express=" + express +
                '}';
    }
}
