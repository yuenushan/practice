package com.github.jing.spring.aop.chain;

/**
 * Created by chenjing28 on 18/3/16.
 */
public abstract class ChainHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();
}
