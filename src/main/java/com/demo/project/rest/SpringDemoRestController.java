package com.demo.project.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RestController
public class SpringDemoRestController {

    @GetMapping("/demo")
    public ResponseEntity<String> helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        String content = 
            "<header>"
            + "<h1><span><center><b><font color=red size=7>Welcome to Developer Day!</font></b></center></span></h1>"
            + "</header>";
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.TEXT_HTML);
        //return ResponseEntity.ok(String.format("Hello %s!", name));
        return new ResponseEntity<String>(content, responseHeaders, HttpStatus.OK);
    }
}