package com.github.jing.spring.aop;

import com.github.jing.spring.aop.springproxy.BeanSelfAware;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by chenjing28 on 18/3/10.
 */
@Component
public class RealSubject implements Subject, BeanSelfAware{

    @Autowired
    private Print print;
//    @Autowired
//    private ApplicationContext context;
    private Subject proxySubject;
//
//    @PostConstruct
//    private void setProxySubject() {
//        proxySubject = context.getBean(Subject.class);
//    }



    @Override
    public void request() {
//        printTime();
        System.out.println("deal request");
        proxySubject.hello();
//        System.out.println(proxySubject.getClass().getName());
        // 获取当前代理对象，使得内部方法调用也能被切
//        Subject proxySubject = (Subject)AopContext.currentProxy();
//        proxySubject.hello();
//        hello();
//        System.out.println(proxySubject.getClass().getName());
//        System.out.println(this.getClass().getName());
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    public void printTime() {
        print.printTime();
    }

    @Override
    public void setSelf(Object proxyBean) {
        proxySubject = (Subject) proxyBean;
    }
}
