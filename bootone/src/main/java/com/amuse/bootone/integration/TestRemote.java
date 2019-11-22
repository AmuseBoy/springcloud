package com.amuse.bootone.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName TestRemote
 * @Description fallback是熔断open时的毁掉函数
 * @Author 刘培振
 * @Date 2018/7/9 20:27
 * @Version 1.0
 */
@FeignClient(name = "bootthree",fallback = TestRemoteHystrix.class)
public interface TestRemote {

    @RequestMapping(value = "/testThree" , method = RequestMethod.GET)
    String testThree();
}
