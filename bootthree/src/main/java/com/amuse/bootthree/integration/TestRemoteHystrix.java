package com.amuse.bootthree.integration;

import org.springframework.stereotype.Component;

/**
 * @ClassName TestRemoteHystrix
 * @Description 熔断回掉类
 * @Author 刘培振
 * @Date 2018/7/9 22:44
 * @Version 1.0
 */
@Component
public class TestRemoteHystrix implements TestRemote {

    @Override
    public String testOne() {
        return "BOOTONE 服务 /testOne 资源请求失败！";
    }
}
