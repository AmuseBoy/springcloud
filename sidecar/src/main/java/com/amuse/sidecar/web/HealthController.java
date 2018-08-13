package com.amuse.sidecar.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HealthController
 * @Description TODO
 * @Author 刘培振
 * @Date 2018/7/8 4:03
 * @Version 1.0
 */
@RestController
public class HealthController {

    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public Map<String,Object> health(){
        Map<String,Object> map = new HashMap<>();
        map.put("status","UP");
        return map;
    }
}
