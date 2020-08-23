package com.example.springdockerexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/greetings")
    @ResponseBody
    public String greetings(){
        return "Is this a JoJo reference?";
    }
}
