package com.github.jing.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/10.
 */
@Component
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
