package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceIf {
@Autowired
UserJPARepo userRepo;
@Override
public User saveUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).get();
    }
}
