package com.github.jing.spring.aop.staticproxy;

import com.github.jing.spring.aop.RealSubject;
import com.github.jing.spring.aop.Subject;

/**
 * Created by chenjing28 on 18/3/10.
 */
public class StaticProxySubject implements Subject {

    private RealSubject realSubject;

    public StaticProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        realSubject.request();
        System.out.println("after");
    }

    @Override
    public void hello() {
        System.out.println("before");
        realSubject.hello();
        System.out.println("after");
    }
}
