package com.github.jing.spring.aop.chain;

import java.util.List;

/**
 * Created by chenjing28 on 18/3/16.
 */
public class Chain {
    private List<ChainHandler> chainHandlers;
    private int index = 0;

    public Chain(List<ChainHandler> chainHandlers) {
        this.chainHandlers = chainHandlers;
    }

    public void proceed() {
        if (index < chainHandlers.size()) {
            chainHandlers.get(index++).execute(this);
        }
    }
}
