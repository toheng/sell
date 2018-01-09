package com.hengo.logger;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hengo.
 * 2018/1/7 21:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest1 {
    @Test
    public void test1() {
        String name = "hengo";
        String password = "123456";
        log.debug("debug...");
        log.info("name: "+ name + ", password: "+ password);
        log.info("name: {}, password: {}",name, password);
        log.error("error...");
    }
}
