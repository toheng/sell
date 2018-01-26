package com.hengo.constant;

/**
 * Redis常量
 * Created by Hengo.
 * 2018/1/25 20:55
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    //过期时间 2小时
    Integer EXPIRE = 7200;
}
