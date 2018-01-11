package com.hengo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Hengo.
 * 2018/1/11 18:14
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    /** 订单id. */
    @Id
    private String detailId;

    /** . */
    private String orderId;

    /** . */
    private String productId;

    /** . */
    private String productName;

    /** . */
    private BigDecimal productPrice;

    /** . */
    private Integer productQuantity;

    /** . */
    private String productIcon;

    /** . */
    private Date createTime;

    /** . */
    private Date updateTime;

}
