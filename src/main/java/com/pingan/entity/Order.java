package com.pingan.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/3/31 9:03
 */

@Data
public class Order  {

     private Long orderId;  //订单主键id
     private BigDecimal price; //金额
     private Long userId; // 用户id
     private String  status;//状态',
     private Date createTime;

}
