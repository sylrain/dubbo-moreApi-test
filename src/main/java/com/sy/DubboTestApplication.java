package com.sy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ImportResource({"classpath:dubbo-provider.xml"})
public class DubboTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboTestApplication.class, args);
    }
}
