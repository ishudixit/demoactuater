package com.example.demoactuater;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping(value = "/hey")
    public String welcome(){
        return "hello world";
    }

}
