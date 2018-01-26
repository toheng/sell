package com.hengo.service;

import com.hengo.dataobject.SellerInfo;
import org.springframework.stereotype.Service;

/**
 * 卖家端
 * Created by Hengo.
 * 2018/1/25 13:35
 */
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
