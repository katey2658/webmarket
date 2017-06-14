package com.katey268.web.enums;

/**
 * Created by 11456 on 2017/1/2.
 */
public enum VoteStateEnum {
    SUCCESS(1,"投票成功"),
    VOTE_OVERTIME(-1,"超过指定次数"),
    INNER_ERROR(-2,"系统异常"),
    DATE_REWRITE(-3,"数据篡改");

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
     * 全参数构造
     * @param state
     * @param stateInfo
     */
    VoteStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 根据编码来获取一个状态信息
     * @param index
     * @return
     */
    public static VoteStateEnum stateOf(int index){
        for (VoteStateEnum state:values()){
            if (state.getState()==index){
                return state;
            }
        }
        return null;
    }
}
