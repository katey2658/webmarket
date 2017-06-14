package com.katey268.web.entity;

import java.util.Date;

/**
 * Created by 11456 on 2016/12/30.
 */
public class ExpressLog {

    /**
     * 无参构造
     */
    public ExpressLog(){

    }

    /**
     * 有参数构造
     * @param expressCode
     * @param info
     */
    public ExpressLog(Long expressCode,String info){
        this.expressCode=expressCode;
        this.info=info;
    }

    /**
     * 全参构造
     * @param expressCode
     * @param createTime
     * @param info
     */
    public ExpressLog(long expressCode, Date createTime, String info) {
        this.expressCode = expressCode;
        this.createTime = createTime;
        this.info = info;
    }

    /**
     * 快递编号
     */
    private long expressCode;

    public void setExpressCode(long expressCode) {
        this.expressCode = expressCode;
    }

    public long getExpressCode() {
        return expressCode;
    }


    /**
     * 日志产生时间点
     */
    private Date createTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 快递信息
     */
    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ExpressLog{" +
                "expressCode=" + expressCode +
                ", info='" + info + '\'' +
                '}';
    }
}
