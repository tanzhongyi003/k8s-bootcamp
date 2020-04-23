package com.baidu.codemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.baidu.codemaster", "com.baidu.macross"})
public class HouseBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseBackendApplication.class, args);
    }
}
