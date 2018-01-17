package com.hengo.service;

import com.hengo.dataobject.ProductInfo;
import com.hengo.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Hengo.
 * 2018/1/10 16:30
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /*
     * 查询所有在架商品
     * @return
     * */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // 减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
