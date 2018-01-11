package com.hengo.enums;

import lombok.Getter;

/**
 * Created by Hengo.
 * 2018/1/11 18:03
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消")
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
