package com.booboil.booboilojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.booboil.booboilojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.booboil")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.booboil.booboilojbackendserviceclient.service"})
public class BooboilOjBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooboilOjBackendUserServiceApplication.class, args);
    }

}
