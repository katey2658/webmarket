package com.katey268.web.dto;

import com.katey268.web.entity.Participartor;
import com.katey268.web.enums.VoteStateEnum;

/**
 * Created by 11456 on 2017/1/2.
 */
public class VoteExecution {
    /**
     * 参与者编号：非投票用户
     */
    private long participartorId;

    /**
     * 投票结果状态
     */
    private int state;

    /**
     * 状态表示
     */
    private String info;

    /**
     * 成功投票对象
     */
    private Participartor participartor;

    /**
     * 投票成功
     * @param participartorId
     * @param stateEnum
     * @param info
     * @param participartor
     */
    public VoteExecution(long participartorId, VoteStateEnum stateEnum, String info, Participartor participartor) {
        this.participartorId = participartorId;
        this.state = state;
        this.info = info;
        this.participartor = participartor;
    }

    /**
     * 投票成功
     * @param participartorId
     * @param stateEnum
     * @param participartor
     */
    public VoteExecution(long participartorId, VoteStateEnum stateEnum, Participartor participartor) {
        this.participartorId = participartorId;
        this.state = state;
        this.participartor = participartor;
    }

    /**
     * 投票失败
     * @param participartorId
     * @param stateEnum
     */
    public VoteExecution(long participartorId, VoteStateEnum stateEnum) {
        this.participartorId = participartorId;
        this.state = state;
        this.participartor = participartor;
    }

}
