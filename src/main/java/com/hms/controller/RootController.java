package com.hms.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class RootController {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)

    public String rootMap(){

        return "Tamzid!";
    }

    @GetMapping(value = "/")
    public String root(){

        return "hello!!";
    }
}
