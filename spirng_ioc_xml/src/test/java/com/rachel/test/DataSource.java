package com.rachel.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author Rachel
 * @date 2022/8/10 10:59
 * @desciption:
 * @status
 */
public class DataSource {
    @Test
    public void testGetDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource druidDataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getActiveCount() );
    }
}
