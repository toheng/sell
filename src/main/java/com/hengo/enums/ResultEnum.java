package com.hengo.enums;

import lombok.Getter;

/**
 * Created by Hengo.
 * 2018/1/12 14:38
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
