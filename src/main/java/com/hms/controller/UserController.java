package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceIf userService;

    @PostMapping(value = "/add_user")
    public User saveUser(@RequestBody User user) {

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

    @GetMapping(value = "/user/{id}")
    public User finebyid(@PathVariable("id") long id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/show_all")
    public List<User> getAllUser() {
        return userService.getUserAll();
    }


    @PutMapping(value = "/update/{id}")
    public User updateById(@PathVariable long id, @RequestBody User userInfo) {
        return userService.updateById(id, userInfo);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable long id) {
        userService.deleteById(id);
    }

}
