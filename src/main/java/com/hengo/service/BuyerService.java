package com.hengo.service;

import com.hengo.dto.OrderDTO;

/**
 * Created by Hengo.
 * 2018/1/16 20:33
 */
public interface BuyerService {
    // 查询订单
    OrderDTO findOrderOne(String openid, String orderId);
    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
