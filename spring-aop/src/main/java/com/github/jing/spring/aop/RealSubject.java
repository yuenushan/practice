package com.github.jing.spring.aop;

/**
 * Created by chenjing28 on 18/3/10.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("deal request");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
