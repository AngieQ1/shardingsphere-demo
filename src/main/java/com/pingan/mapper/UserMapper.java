package com.pingan.mapper;

import com.pingan.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/4/2 9:11
 */
@Mapper
@Component
public interface UserMapper {

    @Insert("insert into t_user (full_name,user_type,create_time) values (#{fullName},#{userType},now())")
    void insertUser(User user);



    @Select("<script>" +
            "select * from t_user where user_id in " +
            "<foreach collection='ids' open='(' close=')' item='id' separator=','>" +
            "#{id} " +
            "</foreach> " +
            "</script>")
    List<User> selectUserIds(@Param("ids") List<Long> ids);

    @Select("<script>" +
            "SELECT * " +
            " from t_user u, t_dict d where u.user_type = d.code " +
            "and user_id in " +
            "<foreach collection='ids' open='(' close=')' item='id' separator=','>" +
            "#{id} " +
            "</foreach> " +
            "</script>")
    List<Map> selectUserInfoByIds(@Param("ids") List<Long> ids);
}
