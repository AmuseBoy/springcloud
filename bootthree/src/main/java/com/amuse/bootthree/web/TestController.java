package com.amuse.bootthree.web;

import com.amuse.bootthree.integration.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/testRemote",method = RequestMethod.GET)
    public String testRemote(){
        return testRemote.testOne();
    }

    @RequestMapping(value = "/testRemote2",method = RequestMethod.GET)
    public String testRemote2(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8090/testOne",String.class);
    }

    @RequestMapping(value = "/testRemote3",method = RequestMethod.GET)
    public String testRemote3(){
        return restTemplate.getForObject("http://BOOTONE/testOne",String.class);
    }

}
