package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface UserServiceIf {

    User saveUser(User user);

    User findById(long id);
    public List<User> getUserAll();
}
