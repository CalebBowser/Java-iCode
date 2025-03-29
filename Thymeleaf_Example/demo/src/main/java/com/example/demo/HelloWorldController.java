package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {

    /*@RequestMapping("path", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }*/
    
    @GetMapping("")
    public String helloWorld() {
        return "ThymeleafExample";
    }

    @GetMapping("/scream")
    @ResponseBody
    public String Scream() {
        return "AHHHHHHHHHHHHHHHHHHHHHHH!";
    }
}
