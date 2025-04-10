package com.example.frame.service;


import com.example.frame.controller.request.AccountLoginRequest;
import com.example.frame.controller.request.AccountRegisterRequest;
import com.example.frame.utils.JsonData;

public interface AccountService{
    JsonData register(AccountRegisterRequest accountRegisterRequest);

    JsonData login(AccountLoginRequest accountLoginRequest);
}
