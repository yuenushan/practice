package com.github.jing.spring.aop.simplechain;

/**
 * Created by chenjing28 on 18/3/16.
 */
public class Client {

    static class HandlerA extends Handler {
        @Override
        protected void handlerProcess() {
            System.out.println("handle by A");
        }
    }

    static class HandlerB extends Handler {
        @Override
        protected void handlerProcess() {
            System.out.println("handle by B");
        }
    }

    static class HandlerC extends Handler {
        @Override
        protected void handlerProcess() {
            System.out.println("handle by C");
        }
    }

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();
        handlerA.setSuccesor(handlerB);
        handlerB.setSuccesor(handlerC);
        handlerA.execute();
    }

}
