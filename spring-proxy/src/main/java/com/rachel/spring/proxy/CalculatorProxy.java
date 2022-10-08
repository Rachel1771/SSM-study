package com.rachel.spring.proxy;

/**
 * @author Rachel
 * @date 2022/8/16 23:11
 * @desciption:
 * @status
 */
public class CalculatorProxy implements Calculator{
    private Calculator target;

    public CalculatorProxy(Calculator target){
        this.target = target;
    }
    public int add(int i, int j) {
        System.out.println("[日志] add开始执行，参数为"+i+","+j);
        System.out.println("[日志] add结束执行，结果为"+target.add(i,j));
        return target.add(i,j);

    }

    public int sub(int i, int j) {
        System.out.println("[日志] sub开始执行，参数为"+i+","+j);
        System.out.println("[日志] sub结束执行，结果为"+target.sub(i,j));
        return target.sub(i,j);
    }

    public int mul(int i, int j) {
        System.out.println("[日志] mul开始执行，参数为"+i+","+j);
        System.out.println("[日志] mul结束执行，结果为"+target.mul(i,j));
        return target.mul(i,j);
    }

    public int div(int i, int j) {
        System.out.println("[日志] div开始执行，参数为"+i+","+j);
        System.out.println("[日志] div结束执行，结果为"+target.div(i,j));
        return target.div(i,j);
    }
}
