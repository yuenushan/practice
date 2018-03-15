package com.github.jing.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by chenjing28 on 18/3/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RealSubjectTest {

    @Autowired
    private Subject subject;

    @Test
    public void request() throws Exception {
        subject.request();
//        subject.hello();
    }

}