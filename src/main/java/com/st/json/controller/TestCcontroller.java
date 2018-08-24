package com.st.json.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestCcontroller {
    @GetMapping("/")
    public String test1(){
        return "index";
    }
}
