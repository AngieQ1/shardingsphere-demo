package com.pingan;

import com.pingan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/3/31 9:24
 */
@SpringBootTest

public class OrderTest {


    @Resource
    private UserMapper userMapper;


    @Test
    void testSelectUserInfoByIds() {
        List<Long> ids = Arrays.asList(1L,2L);

        List<Map> users = userMapper.selectUserInfoByIds(ids);
        System.out.println(users);
    }


}
