package com.github.jing.spring.aop.dynamicproxy;

import com.github.jing.spring.aop.RealSubject;
import com.github.jing.spring.aop.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by chenjing28 on 18/3/10.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[] {Subject.class},
                new JdkProxySubject(new RealSubject()));
        subject.request();
        subject.hello();
    }
}
