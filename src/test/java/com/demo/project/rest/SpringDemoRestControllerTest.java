package com.demo.project.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class SpringDemoRestControllerTest {

    @Autowired
    SpringDemoRestController controller;

    @Test
    public void getHelloWorld() {
        ResponseEntity<String> responseEntity = controller.helloWorld("World");

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Hello World!", responseEntity.getBody());
    }

    @Test
    public void getHelloWorldWithParam() {
        ResponseEntity<String> responseEntity = controller.helloWorld("friend");

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Hello friend!", responseEntity.getBody());
    }

}