package com.rachel.controller;

import com.rachel.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Rachel
 * @date 2022/8/30 15:35
 * @desciption:
 * @status
 */
@Controller
public class TestParmController {

    @RequestMapping("/param")
    public String getServlet(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username"+username+"\n"+"password"+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String GetServletByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
