package com.uestc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 10:46
 */

@SpringBootApplication
@MapperScan("com.uestc.mapper")
public class SecurityApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SecurityApplication.class, args);
        System.out.println(111);
    }
}
