package com.hms.service;

import com.hms.model.User;

public interface UserServiceIf {

    User saveUser(User user);

    User findById(long id);
}
