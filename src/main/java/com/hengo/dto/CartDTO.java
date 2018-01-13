package com.hengo.dto;

import lombok.Data;

/**
 * Created by Hengo.
 * 2018/1/12 18:20
 */
@Data
public class CartDTO {

    /* 商品. */
    private String productId;

    /* 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
