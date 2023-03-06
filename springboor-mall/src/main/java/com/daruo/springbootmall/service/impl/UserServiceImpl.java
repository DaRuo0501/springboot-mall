package com.daruo.springbootmall.service.impl;

import com.daruo.springbootmall.dao.UserDao;
import com.daruo.springbootmall.dto.UserRegisterRequest;
import com.daruo.springbootmall.model.User;
import com.daruo.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
