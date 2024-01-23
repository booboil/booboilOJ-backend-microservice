package com.booboil.booboilojbackendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

// 不需要加载数据库配置
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableSwagger2WebMvc
public class BooboilOjBackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooboilOjBackendGatewayApplication.class, args);
    }

}
