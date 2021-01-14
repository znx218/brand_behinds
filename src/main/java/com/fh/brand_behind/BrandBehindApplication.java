package com.fh.brand_behind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.brand_behind.dao")
public class BrandBehindApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandBehindApplication.class, args);
    }

}
