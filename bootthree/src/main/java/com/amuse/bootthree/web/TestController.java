package com.amuse.bootthree.web;

import com.amuse.bootthree.integration.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 刘培振
 * @Date 2018/7/9 20:28
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    private TestRemote testRemote;

    @RequestMapping(value = "/testRemote",method = RequestMethod.GET)
    public String testRemote(){
        return testRemote.testOne();
    }

}
