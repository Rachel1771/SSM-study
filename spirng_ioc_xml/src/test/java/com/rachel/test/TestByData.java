package com.rachel.test;

import com.rachel.spirng_ioc_xml.pojo.Clazz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/5 16:02
 * @desciption:
 * @status
 */
public class TestByData {
    @Test
    public void getClazz()
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz classTwo = (Clazz) ioc.getBean("ClassTwo");
        System.out.println(classTwo);
    }
}
