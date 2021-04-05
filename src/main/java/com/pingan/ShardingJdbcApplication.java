package com.pingan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 贺晓清
 * @date 2021/3/31 9:21
 */
@SpringBootApplication
@MapperScan("com.pingan.mapper")
public class ShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class, args);
    }
}
