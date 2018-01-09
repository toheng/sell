package com.hengo.logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hengo.
 * 2018/1/7 20:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest  {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        logger.info("info...");
        logger.error("error...");
        logger.debug("debug...");
    }
}
