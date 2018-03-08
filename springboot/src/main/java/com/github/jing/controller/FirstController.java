package com.github.jing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjing28 on 18/3/3.
 */
@RestController
public class FirstController {

    @GetMapping(value = "hello/{name}")
    public ResponseResult hello(@PathVariable String name) {
        return new ResponseResult("hello " + name);
    }

    @GetMapping(value = "hello2/{name}")
    public ResponseEntity<ResponseResult> hello2(@PathVariable String name) {
        return new ResponseEntity<>(hello(name), HttpStatus.BAD_REQUEST);
    }
}
