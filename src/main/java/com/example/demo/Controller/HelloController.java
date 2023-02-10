package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gleeman on 2023/2/10 10:38
 */


@RestController
@RequestMapping(value = "/test")
public class HelloController {
    @RequestMapping(value = "/hello")
    public String test(){
        return "success";
    }
}
