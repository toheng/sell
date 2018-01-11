package com.hengo.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by Hengo.
 * 2018/1/10 16:42
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
