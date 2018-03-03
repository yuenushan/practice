package com.github.jing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjing28 on 18/3/3.
 */
@RestController
public class FirstController {

    @GetMapping(value = "hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name;
    }
}
