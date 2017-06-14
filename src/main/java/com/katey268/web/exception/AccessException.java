package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/2.
 * 访问异常：运行期异常
 */
public class AccessException extends RuntimeException {
    public AccessException(String message) {
        super(message);
    }

    public AccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
