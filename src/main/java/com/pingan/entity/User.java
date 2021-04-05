package com.pingan.entity;

import lombok.Data;

import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/4/2 9:09
 */
@Data
public class User{

    private Long userId;

    private String fullName;

    private String userType;

    private Date createTime;


    private Long dictId;

    private String type;

    private String code;

    private String value;
}
