package com.a3fun.game.xique.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @ResponseBody
    @GetMapping(value = "/")
    public String Index(){
        return "Welcome to come here!";
    }
}
