package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
