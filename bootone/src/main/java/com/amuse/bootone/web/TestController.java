package com.amuse.bootone.web;

import com.amuse.bootone.integration.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestRemote testRemote;

    @RequestMapping(value = "/testOne" , method = RequestMethod.GET)
    public String testOne(){
        return "这是返回testOne测试数据";
    }

    @RequestMapping(value = "/testThree" , method = RequestMethod.GET)
    public String testThree(){
        return testRemote.testThree();
    }
}
