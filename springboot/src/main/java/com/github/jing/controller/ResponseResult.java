package com.github.jing.controller;

/**
 * Created by chenjing28 on 18/3/3.
 */
public class ResponseResult {
    private int code = 0;
    private String message = "success";
    private Object data;

    public ResponseResult(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
