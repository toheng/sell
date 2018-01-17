package com.hengo.exception;

import com.hengo.enums.ResultEnum;

/**
 * Created by Hengo.
 * 2018/1/12 14:37
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
