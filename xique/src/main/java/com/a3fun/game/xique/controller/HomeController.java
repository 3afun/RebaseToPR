package com.a3fun.game.xique.controller;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
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

    @ResponseBody
    @GetMapping(value = "/books")
    public String books() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("世界史", "100");
        return jsonObject.toString();
    }

}
