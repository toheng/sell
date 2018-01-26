package com.hengo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Hengo.
 * 2018/1/25 16:34
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权Url
     */
    private String wechatMpAuthorize;

    /**
     * 微信开放平台授权Url
     */
    private String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    private String sell;
}
