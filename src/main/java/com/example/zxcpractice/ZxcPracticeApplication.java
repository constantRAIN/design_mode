package com.example.zxcpractice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.zxcpractice")
@MapperScan(basePackages = "com.example.zxcpractice.mapper")
public class ZxcPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxcPracticeApplication.class, args);
    }

}
