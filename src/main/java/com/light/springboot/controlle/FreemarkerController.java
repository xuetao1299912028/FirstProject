package com.light.springboot.controlle;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hello1")
    public String hello(Map<String,Object> map) {
        
        map.put("msg", "Hello Freemarker");
        return "hello";
    }
}
