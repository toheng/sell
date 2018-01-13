package com.hengo.service.impl;

import com.hengo.dataobject.OrderDetail;
import com.hengo.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Hengo.
 * 2018/1/13 22:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "110110";

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress("广州");
        orderDTO.setBuyerName("Jack");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        orderDTO.setBuyerPhone("1234567890");

        List<OrderDetail>  orderDetailList = new ArrayList<>();

        OrderDetail od1 = new OrderDetail();
        od1.setProductId("3456");
        od1.setProductQuantity(1);

        OrderDetail od2 = new OrderDetail();
        od2.setProductId("123458");
        od2.setProductQuantity(2);

        orderDetailList.add(od1);
        orderDetailList.add(od2);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】 result = {}", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}