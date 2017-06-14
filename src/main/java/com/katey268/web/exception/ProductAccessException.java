package com.katey268.web.exception;

/**
 * Created by 11456 on 2017/1/1.
 *
 * 商品访问异常,商品不存在或者已经下架
 */
public class ProductAccessException extends PurchaseException{

    public ProductAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductAccessException(String message) {
        super(message);
    }
}
