package com.hengo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Hengo.
 * 2018/1/11 12:46
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -5360355951762227697L;

    // 此注解, 返回前端的名字
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
