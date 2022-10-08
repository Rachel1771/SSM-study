package com.rachel.spring.test;

import com.rachel.spring.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/4 13:14
 * @desciption: 测试
 * @status nice
 */
public class hello {
    @Test
    public void testHelloWorld()
    {
        ApplicationContext IOC = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld o = (HelloWorld) IOC.getBean("hello");
        o.sayhello();

    }
}
