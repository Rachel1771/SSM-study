package com.rachel.spring;

import com.rachel.spring.proxy.Calculator;
import com.rachel.spring.proxy.CalculatorProxy;
import com.rachel.spring.proxy.ProxyFactory;
import com.rachel.spring.proxy.impl.CalculatorImpl;
import org.junit.Test;

/**
 * @author Rachel
 * @date 2022/8/17 17:52
 * @desciption:
 * @status
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        CalculatorProxy calculatorProxy = new CalculatorProxy(new CalculatorImpl());
        calculatorProxy.add(1,3);
    }

    @Test
    public void testDynamicProxy(){
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(10,2);
        //proxy.div(1,1);
    }
}
