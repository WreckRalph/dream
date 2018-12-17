package com.calendar.dream.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController {
 
    @RequestMapping("/test")
    public String Index(){
        // return "你好，欢迎使用Visual Studio Code!";
		System.out.println("fff");
        return "views/index.html";
    }
}