package com.java5.onthijava6.service;

import com.java5.onthijava6.entity.User;

import java.util.List;

public interface UserSevice {
    List<User> getAllUser();

    User saveUser(User user);

    int deleteUser(String userId);

    List<User> findByKeyword(String key);
}
