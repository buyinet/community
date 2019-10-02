package com.bywlkjs.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String greeting(){ return "index"; }

}
