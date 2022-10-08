package com.rachel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rachel
 * @date 2022/8/21 15:11
 * @desciption:
 * @status
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
