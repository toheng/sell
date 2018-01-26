package com.hengo.service;

import com.hengo.dto.OrderDTO;

/**
 * 推送消息
 * Created by Hengo.
 * 2018/1/26 13:55
 */
public interface PushMessageService {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
