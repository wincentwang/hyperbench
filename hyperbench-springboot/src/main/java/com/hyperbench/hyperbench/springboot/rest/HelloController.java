package com.hyperbench.hyperbench.springboot.rest;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


    public static void main(String[] args) {

    }
}
