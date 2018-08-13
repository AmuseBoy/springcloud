package com.amuse.boottwo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author 刘培振
 * @Date 2018/7/8 14:45
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${hello.world}")
    private String configValue;

    @RequestMapping(value = "/getConfig",method = RequestMethod.GET)
    public String getConfig(){
        return "配置:"+ configValue;
    }
}
