package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 支付异常
 */
public class PayFailedException extends PurchaseException {

    public PayFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayFailedException(String message) {
        super(message);
    }
}
