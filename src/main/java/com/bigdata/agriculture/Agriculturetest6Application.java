package com.bigdata.agriculture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bigdata.agriculture.app.mapper")
public class Agriculturetest6Application {

    public static void main(String[] args) {
        SpringApplication.run(Agriculturetest6Application.class, args);
    }

}
