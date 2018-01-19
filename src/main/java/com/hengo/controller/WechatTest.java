package com.hengo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Hengo.
 * 2018/1/18 14:45
 */
@RestController
@RequestMapping("/wechat")
@Slf4j
public class WechatTest {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("【】【】");
        log.info("code={}", code);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxe70d7e967d020ebc&secret=0b512ffc3d269aa5feff4473f3e304d0&code="+ code +"&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
    }
}







