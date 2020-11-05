package com.yangjie.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/show")
    public String test(HttpServletRequest req, HttpServletResponse resp) {
        return "hello world";
    }

    @RequestMapping("/showpage")
    public ModelAndView showpage(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("login");
    }

    public void show() {
        System.out.println("123");
    }

}
