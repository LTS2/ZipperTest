package com.wj.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("HomeController 의 index() 메소드 실행");
        return "index"; // => index.jsp 출력
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("Test()");
        return "test";
    }

    

}

