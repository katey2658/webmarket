package com.katey268.web.enums;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 使用枚举来表述常量数据字段
 */
public enum PurchaseStateEnum {
    SUCCESS(1,"成功购买"),
    STOCKOUT(0,"商品缺货中"),
    ACCESS_ERROR(-1,"访问失败"),
    PAY_ERROR(-2,"支付失败"),
    INNER_ERROR(-3,"系统异常"),
    DATE_REWRITE(-4,"数据篡改");

    /**
     * 状态
     */
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 信息
     */
    private String stateInfo;

    public String getStateInfo() {
        return stateInfo;
    }


    /**
     * 全参构造
     * @param state
     * @param stateInfo
     */
    PurchaseStateEnum(int state, String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }

    /**
     * 根据编码来获取一个状态信息
     * @param index
     * @return
     */
    public static PurchaseStateEnum stateOf(int index){
        for (PurchaseStateEnum state:values()){
            if (state.getState()==index){
                return state;
            }
        }
        return null;
    }
}
