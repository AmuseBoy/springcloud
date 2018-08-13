package com.amuse.bootone.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 刘培振
 * @Date 2018/7/2 17:12
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/testOne" , method = RequestMethod.GET)
    public String testOne(){
        return "这是返回测试数据";
    }
}
