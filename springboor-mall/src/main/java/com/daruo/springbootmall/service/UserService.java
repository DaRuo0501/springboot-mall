package com.daruo.springbootmall.service;

import com.daruo.springbootmall.dto.UserLoginRequest;
import com.daruo.springbootmall.dto.UserRegisterRequest;
import com.daruo.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
