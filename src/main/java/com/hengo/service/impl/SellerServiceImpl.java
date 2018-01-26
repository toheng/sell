package com.hengo.service.impl;

import com.hengo.dataobject.SellerInfo;
import com.hengo.repository.SellerInfoRepository;
import com.hengo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hengo.
 * 2018/1/25 13:37
 */
@Service
public class SellerServiceImpl implements SellerService{

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }
}
