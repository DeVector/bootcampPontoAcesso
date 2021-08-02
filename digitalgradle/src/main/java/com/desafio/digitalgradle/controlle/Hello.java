package com.desafio.digitalgradle.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String helloWord(){
        return "Hello Word!";
    }

}