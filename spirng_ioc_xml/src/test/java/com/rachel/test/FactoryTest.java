package com.rachel.test;

import com.rachel.spirng_ioc_xml.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/12 13:27
 * @desciption:
 * @status
 */

/**
 * FactoryBean是一个接口，需要实现接口的类
 * 其中三个方法：
 * getObject():通过一个对象交给IOC容器管理
 * getObejectType():设置所提供对象的属性
 * isSingleton():对象是否单例
 * 当把FactoryBean实现类设置为Bean的时候，当前类的获取方法会把返回的对象交给IOC容器
 */
public class FactoryTest {
    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-FactoryBean.xml");
        User user = ac.getBean(User.class);
        System.out.println(user);
    }
}
