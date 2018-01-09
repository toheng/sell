package com.hengo.repository;

import com.hengo.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hengo.
 * 2018/1/9 22:35
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
