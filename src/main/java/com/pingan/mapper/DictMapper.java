package com.pingan.mapper;

import com.pingan.entity.Dict;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/4/2 10:39
 */
@Mapper
@Component
public interface DictMapper {

    @Insert("insert into t_dict (dict_id,type,code, value) values(#{dictId},#{type},#{code},#{value})")
    int insertDict(Dict dict);

    @Update("update t_dict set code= #{code},value=#{value} where dict_id= #{dictId} ")
    int updateDict(Dict dict);



    @Delete("delete from  t_dict where dict_id= #{dictId} ")
    int deleteDict(Dict dict);
}
