package com.example.xiaofeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xiaofeng.dao")
public class XiaofengApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaofengApplication.class, args);
    }

}
