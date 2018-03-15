package com.github.jing.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/10.
 */
@Component
public class Print {
    public void printTime() {
        System.out.println(System.currentTimeMillis());
    }
}
