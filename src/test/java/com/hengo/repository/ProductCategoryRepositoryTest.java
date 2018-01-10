package com.hengo.repository;

import com.hengo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hengo.
 * 2018/1/9 22:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("精选", 3);
        ProductCategory result = repository.save(productCategory);
//        Assert.assertNotNull(result);
//        断言不期望是空，期望是result，结果和上面一致：Assert.assertNotNull(result)
        Assert.assertNotEquals(null, result);
    }
}