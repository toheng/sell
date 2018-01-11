package com.hengo.VO;

import lombok.Data;

/**
 * Http请求返回的最外层对象
 * Created by Hengo.
 * 2018/1/10 23:44
 */
@Data
public class ResultVO<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T Data;

}
