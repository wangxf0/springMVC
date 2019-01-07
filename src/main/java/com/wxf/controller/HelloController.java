package com.wxf.controller;

import com.wxf.service.HkstockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController implements Controller{

    @Resource(name = "HkstockService")
    HkstockService hkstockService;

    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) {
        ModelAndView modelAndView=new ModelAndView("index.jsp");

        modelAndView.addObject("message",hkstockService.getHkStock().getHkname());
        return modelAndView;
    }
}
