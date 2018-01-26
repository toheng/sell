package com.hengo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Hengo.
 * 2018/1/25 12:13
 */
@Entity
@Data
public class SellerInfo {
    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

}
