package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/use_add")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

 @GetMapping(value = "/")
    public String root(){
        return "Hi Tamzid";
    }

}
