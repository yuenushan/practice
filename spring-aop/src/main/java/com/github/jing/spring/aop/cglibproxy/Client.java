package com.github.jing.spring.aop.cglibproxy;

import com.github.jing.spring.aop.RealSubject;
import com.github.jing.spring.aop.Subject;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by chenjing28 on 18/3/10.
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
        subject.request();
    }
}
