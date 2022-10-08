package com.rachel.spirng_ioc_xml.controller;

import com.rachel.spirng_ioc_xml.service.UserService;
import lombok.Data;

/**
 * @author Rachel
 * @date 2022/8/12 20:11
 * @desciption:
 * @status
 */
@Data
public class UserController {
    private UserService userService;

    public void saveuser(){
        userService.saveuser();
    }

}
