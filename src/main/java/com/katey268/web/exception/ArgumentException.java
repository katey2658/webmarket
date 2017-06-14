package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/2.
 *
 * 访问异常：关于参数方面的异常
 */
public class ArgumentException extends AccessException{

    public ArgumentException(String message) {
        super(message);
    }

    public ArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
