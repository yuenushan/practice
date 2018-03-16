package com.github.jing.spring.aop.chain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenjing28 on 18/3/16.
 */
public class Client {
    static class ChainHandlerA extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by A");
        }
    }

    static class ChainHandlerB extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by B");
        }
    }

    static class ChainHandlerC extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by C");
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> chainHandlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );
        Chain chain = new Chain(chainHandlers);
        chain.proceed();
    }
}
