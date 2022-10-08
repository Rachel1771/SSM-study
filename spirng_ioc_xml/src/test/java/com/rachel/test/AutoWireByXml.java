package com.rachel.test;

import com.rachel.spirng_ioc_xml.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/12 20:25
 * @desciption:
 * @status
 */
public class AutoWireByXml {
    @Test
    public void autowiretest(){
        ApplicationContext ioc  = new ClassPathXmlApplicationContext("spirng-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveuser();
    }
}
