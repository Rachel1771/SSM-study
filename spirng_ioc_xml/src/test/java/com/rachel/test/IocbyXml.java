package com.rachel.test;

import com.rachel.spirng_ioc_xml.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rachel
 * @date 2022/8/4 13:40
 * @desciption:
 * @status
 */
public class IocbyXml {

   @Test
    public void getStu()
   {
       ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student stu = (Student) ioc.getBean("StuOne");
       System.out.println(stu);

   }

    @Test
    public void TestDI()
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = ioc.getBean(Student.class);
        System.out.println(stu);

    }

    @Test
    public void TestDI2()
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentTwo = (Student) ioc.getBean("studentTwo");
        System.out.println(studentTwo);

    }

    @Test
    public void TestDI3()
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentThree = (Student) ioc.getBean("StudentThree");
        System.out.println(studentThree);
    }
}
