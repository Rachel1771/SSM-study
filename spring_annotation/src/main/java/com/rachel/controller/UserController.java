package com.rachel.controller;

import com.rachel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Rachel
 * @date 2022/8/16 20:08
 * @desciption:
 * @status
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveuser()
    {
        userService.saveuser();
    }
}
