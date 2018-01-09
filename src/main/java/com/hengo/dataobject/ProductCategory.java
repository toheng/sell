package com.hengo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Hengo.
 * 2018/1/9 22:23
 */
@Entity
//动态更新
@DynamicUpdate
//此注解不用写get set方法
@Data
public class ProductCategory {

    /**类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**类目名字. */
    private String categoryName;

    /**类目编号. */
    private Integer categoryType;

    /**创建时间. */
    private Date createTime;

    /**更新时间. */
    private Date updateTime;
}
