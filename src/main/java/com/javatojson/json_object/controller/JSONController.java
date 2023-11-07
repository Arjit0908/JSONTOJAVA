package com.javatojson.json_object.controller;


import com.javatojson.json_object.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

    @Autowired
    private Model model;

    @GetMapping("/get")
    public Model getName(){

        model.setName("Arjit");
        model.setEmail("arjit@gmail.com");
        model.setUserName("arjito");
        model.setPassword("12345678");
        return model;
    }
}
