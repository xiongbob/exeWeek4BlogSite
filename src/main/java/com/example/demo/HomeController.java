package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/BlogSite")
    public String blogSitePage(){
        return "BlogSite";
    }
}