package com.bywlkjs.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(){ return "index"; }

    @GetMapping("/callback")
    public String callback(@RequestParam("code") String code){
        System.out.println("callback下获取的code"+code);
        return null;
    }
}
