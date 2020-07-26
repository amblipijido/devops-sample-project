package com.everis.devops.cloud.cloud.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fake")
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello World!!!");
    }


    @GetMapping(path = "/hello/{name}")
    public ResponseEntity<String> getNamedHello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }

}
