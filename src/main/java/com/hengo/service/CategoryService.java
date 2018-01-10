package com.hengo.service;

import com.hengo.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Hengo.
 * 2018/1/10 10:53
 */
public interface CategoryService {
//    通过类目ID查询
    ProductCategory findOne(Integer categoryId);
//    查询所有类目
    List<ProductCategory> findAll();
//    通过类目编号查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
//    新增和更新类目
    ProductCategory save(ProductCategory productCategory);
}
