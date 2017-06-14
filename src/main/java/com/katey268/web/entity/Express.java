package com.katey268.web.entity;

import java.util.List;

/**
 * Created by 11456 on 2016/12/30.
 */
public class Express {

    /**
     * 无参构造
     */
    public Express(){}

    /**
     * 提取快递信息
     * @param expressCode
     * @param state
     * @param weight
     * @param price
     */
    public Express(Long expressCode, short state, int weight, int price) {
        this.expressCode = expressCode;
        this.state = state;
        this.weight = weight;
        this.price = price;
    }

    /**
     * 提取完全详细信息
     * @param expressCode
     * @param state
     * @param weight
     * @param price
     * @param expressLogs
     */
    public Express(Long expressCode, short state, int weight, int price, List<ExpressLog> expressLogs) {
        this.expressCode = expressCode;
        this.state = state;
        this.weight = weight;
        this.price = price;
        this.expressLogs = expressLogs;
    }

    /**
     * 快递编码
     */
    private long expressCode;

    public void setExpressCode(long expressCode) {

    }
    public long getExpressCode() {
        return expressCode;
    }

    /**
     * 收件信息编号
     */
    private long addressId;

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getAddressId() {
        return addressId;
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
     * 重量（g)
     */
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * 价格（分）
     */
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    /**
     * 快递的运货信息
     */
    private List<ExpressLog> expressLogs;

    public void setExpressLogs(List<ExpressLog> expressLogs) {
        this.expressLogs = expressLogs;
    }

    public List<ExpressLog> getExpressLogs() {
        return expressLogs;
    }


    @Override
    public String toString() {
        return "Express{" +
                "expressCode=" + expressCode +
                ", state=" + state +
                ", weight=" + weight +
                ", price=" + price +
                ", expressLogs=" + expressLogs +
                '}';
    }
}
