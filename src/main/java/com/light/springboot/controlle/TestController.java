package com.light.springboot.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/helloworld")
    public String helloworld() {
        return "<html><head><style type="+"text/css"+">h1 {color: red}p {color: blue}</style></head><body><h1>header 1</h1><p>A paragraph.</p></body></html>";
    }
    
    @GetMapping("/helloworld1")
    public String helloworld1() {
        return "<html><head><style type="+"text/css"+">h1 {color: red}p {color: blue}</style></head><body><h1>header 1</h1><p>A paragraph.</p></body></html>";
    }
 
}