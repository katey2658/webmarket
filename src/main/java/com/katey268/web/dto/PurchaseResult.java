package com.katey268.web.dto;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 用来作为所有Ajax的请求的返回类型，封装json结果
 */
public class PurchaseResult<T> {

    /**
     * 成功后返回对象构造方法
     * @param success
     * @param data 数据
     */
    public PurchaseResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 失败后返回状态
     * @param success
     * @param error
     */
    public PurchaseResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    /**
     * 是否成功
     */
    private boolean success;

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean isSuccess() {
        return success;
    }

    /**
     * 封装的数据
     */
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    /**
     * 出错反馈
     */
    private String error;

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
