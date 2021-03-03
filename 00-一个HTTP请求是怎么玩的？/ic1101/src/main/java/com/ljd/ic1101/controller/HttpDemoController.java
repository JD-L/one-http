package com.ljd.ic1101.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpDemoController {

    @RequestMapping("/httpDemoMethod")
    public String httpDemoMethod(){
        return "请求成功。";
    }
}
