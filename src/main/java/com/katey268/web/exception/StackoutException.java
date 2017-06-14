package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/1.
 * 缺货异常
 */
public class StackoutException extends PurchaseException {

    public StackoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackoutException(String message) {
        super(message);
    }
}

