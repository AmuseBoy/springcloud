package com.amuse.bootthree.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfig
 * @Description TODO
 * @Author 刘培振
 * @Date 2018/9/29 16:35
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {

    @LoadBalanced  //加上该注解后，就必须通过服务实例来互相访问,不加可以通过 ip访问
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
