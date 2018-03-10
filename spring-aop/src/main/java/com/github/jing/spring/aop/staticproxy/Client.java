package com.github.jing.spring.aop.staticproxy;

import com.github.jing.spring.aop.RealSubject;
import com.github.jing.spring.aop.Subject;

/**
 * Created by chenjing28 on 18/3/10.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new StaticProxySubject(new RealSubject());
        subject.request();
        subject.hello();
    }
}
