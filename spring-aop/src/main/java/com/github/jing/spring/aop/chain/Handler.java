package com.github.jing.spring.aop.chain;

/**
 * Created by chenjing28 on 18/3/16.
 */
public abstract class Handler {

    private Handler succesor;

    public Handler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public void execute() {
        handlerProcess();
        if (getSuccesor() != null) {
            succesor.execute();
        }
    }

    protected abstract void handlerProcess();
}
