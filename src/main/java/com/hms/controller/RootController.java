package com.hms.controller;

import com.hms.model.Student;
import com.hms.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RootController {

    @GetMapping(value = "/")
    public String root() {
        return "home";
    }


}
