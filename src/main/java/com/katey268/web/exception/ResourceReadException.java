package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/2.
 *
 * 访问异常：资源读异常
 */
public class ResourceReadException extends AccessException {

    public ResourceReadException(String message) {
        super(message);
    }

    public ResourceReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
