package com.hengo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品（包含类目）
 * Created by Hengo.
 * 2018/1/11 12:41
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 4818175409740604468L;

    // 此注解, 返回给前端显示name
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
