package com.isliujiao.dirtydatacleansing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.*.mapper")
public class DirtyDataCleansingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirtyDataCleansingApplication.class, args);
    }

}
