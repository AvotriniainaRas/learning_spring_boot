package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/") //this annotation maps the root URL ("/") to the index() method    
    public String index() { //the wiew name is index.html, but we don't have to specify the .html extension because Spring Boot will automatically look for it in the resources/templates folder
        return "index";
    }

    @RequestMapping("/sayhello") 
    public String sayHello() { //the wiew name is index.html, but we don't have to specify the .html extension because Spring Boot will automatically look for it in the resources/templates folder
        return "index"; //t
    }
}
