package com.findprop.propertymanagement.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/property-management/helloworld")
    public String getHelloWorld(){
        return "Hellow World from Property Management";
    }
}
