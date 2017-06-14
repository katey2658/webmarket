package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/1.
 * 运行期异常
 * 所有关于购买异常的基类异常
 */
public class PurchaseException extends RuntimeException {

    public PurchaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public PurchaseException(String message) {
        super(message);
    }
}
