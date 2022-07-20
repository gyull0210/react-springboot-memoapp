package com.gyull.dasima.dasima.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.Date;

@RestController
@AllArgsConstructor
@CrossOrigin("http://localhost:3000")
public class HelloController {
    
    @GetMapping(value="/api/hello")
    public String Hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";   
    }
}
