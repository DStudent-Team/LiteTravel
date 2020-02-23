package com.LiteTravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除数据库自动加载
@EnableDiscoveryClient
public class FileApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}