package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.dto.UserRegisterRequest;
import com.daruo.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
