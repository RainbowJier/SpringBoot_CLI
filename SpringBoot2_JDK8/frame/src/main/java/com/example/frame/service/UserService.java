package com.example.frame.service;


import com.example.frame.controller.request.UserLoginRequest;
import com.example.frame.controller.request.UserRegisterRequest;
import com.example.frame.model.JsonData;

public interface UserService {
    JsonData register(UserRegisterRequest userRegisterRequest);

    JsonData login(UserLoginRequest userLoginRequest);

    JsonData getUserById(String id);

    JsonData selectAll(int pageNum, int pageSize);
}
