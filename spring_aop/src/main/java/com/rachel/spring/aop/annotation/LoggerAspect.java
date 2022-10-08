package com.rachel.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Rachel
 * @date 2022/8/18 13:48
 * @desciption:
 * @status
 */
@Aspect
@Component
public class LoggerAspect {
    @Before("execution(public int com.rachel.spring.aop.annotation.impl.CalculatorImpl.add(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }
}
