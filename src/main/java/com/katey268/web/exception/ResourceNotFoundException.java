package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/2.
 *
 * 访问异常：资源不存在异常
 */
public class ResourceNotFoundException  extends AccessException{

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
