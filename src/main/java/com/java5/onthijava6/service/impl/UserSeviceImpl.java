package com.java5.onthijava6.service.impl;

import com.java5.onthijava6.entity.User;
import com.java5.onthijava6.repository.UserRepo;
import com.java5.onthijava6.service.UserSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSeviceImpl implements UserSevice {
    private final UserRepo userRepo;


    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Transactional
    @Override
    public int deleteUser(String userId) {
        return userRepo.deleteUserById(userId);
    }
}
