package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
//    @PostMapping(value = "/user")
//    public String saveUser(@RequestParam String name, @RequestParam String address){
//        User object = new User();
//        object.setName(name);
//        object.setAddress(address);
//        userService.saveUser(object);
//        return "Saved";
//    }

 @GetMapping(value = "/")
    public String root(){
        return "Hi Tamzid!!";
    }



}
