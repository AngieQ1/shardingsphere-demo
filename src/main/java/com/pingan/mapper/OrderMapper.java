package com.pingan.mapper;

import com.pingan.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/3/31 9:23
 */
@Mapper
public interface OrderMapper {


    @Insert("insert into t_order (price,user_id,status,create_time) values(#{price},#{userId},#{status},now())")
    void insertOrder(Order order);

    @Select("<script>" +
            "select * from t_order where order_id in " +
            "<foreach collection='ids' open='(' close=')' item='id' separator=','>" +
            "#{id} " +
            "</foreach>" +
            "</script>")
    List<Order> selectByIds(@Param("ids") List<Long> ids);

    @Select("<script>" +
            "select * from t_order where order_id in " +
            "<foreach collection='ids' open='(' close=')' item='id' separator=','>" +
            "#{id} " +
            "</foreach> " +
            "and user_id = #{userId}" +
            "</script>")
    List<Order> selectByUserIdAndIds(@Param("ids") List<Long> ids, @Param("userId") Long userId);



}
