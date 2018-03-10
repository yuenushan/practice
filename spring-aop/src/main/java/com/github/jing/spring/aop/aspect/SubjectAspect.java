package com.github.jing.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/10.
 */
@Aspect
@Component
public class SubjectAspect {

    @Pointcut("execution(public * com.github.jing.spring.aop.RealSubject.*(..))")
    public void subjectPointCut() {
    }

    @Before("subjectPointCut()")
    public void beforeAdvise() throws Throwable {
        System.out.println("before");
    }
}
