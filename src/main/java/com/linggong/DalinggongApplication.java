package com.linggong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.linggong.mapper")
@SpringBootApplication
public class DalinggongApplication {

    public static void main(String[] args) {
        SpringApplication.run(DalinggongApplication.class, args);
    }

}
