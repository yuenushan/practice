package com.github.jing.spring.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/10.
 */
@Component
public class RealSubject implements Subject {

    @Autowired
    private Print print;

    @Override
    public void request() {
//        printTime();
        System.out.println("deal request");
        // 获取当前代理对象，使得内部方法调用也能被切
        Subject proxySubject = (Subject)AopContext.currentProxy();
        proxySubject.hello();
        hello();
        System.out.println(proxySubject.getClass().getName());
        System.out.println(this.getClass().getName());
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    public void printTime() {
        print.printTime();
    }
}
