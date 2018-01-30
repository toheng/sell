package com.hengo.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * Http请求返回的最外层对象
 * Created by Hengo.
 * 2018/1/10 23:44
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 699357368132024795L;

    /**
     * 错误码.
     */
    private Integer code;

    /**
     * 提示信息.
     */
    private String msg;

    /**
     * 具体内容.
     */
    private T Data;
}
