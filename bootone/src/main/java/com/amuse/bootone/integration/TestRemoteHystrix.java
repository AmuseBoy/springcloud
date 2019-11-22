package com.amuse.bootone.integration;

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
    public String testThree() {
        return "BOOTTHREE 服务 /testThree 资源请求失败！";
    }
}
