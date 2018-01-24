package com.hengo.form;

import lombok.Data;

/**
 * Created by Hengo.
 * 2018/1/24 15:08
 */
@Data
public class CategoryForm {

    private Integer categoryId;
    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
