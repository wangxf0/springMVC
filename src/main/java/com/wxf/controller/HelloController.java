package com.wxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController implements Controller{

    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) {
        ModelAndView modelAndView=new ModelAndView("index.jsp");
        modelAndView.addObject("message","hello");
        return modelAndView;
    }
}
