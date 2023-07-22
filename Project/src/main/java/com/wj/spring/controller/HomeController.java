package com.wj.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("HomeController 의 index() 메소드 실행");
        System.out.println("HomeController 의 index() 메소드 실행");
        System.out.println("33333333333333");
        System.out.println("222222222222222");
        System.out.println("1111111111111111");
        System.out.println("1111111111111111");
        System.out.println("1111111111111111");
        return "index"; // => index.jsp 출력
    }
    
}
