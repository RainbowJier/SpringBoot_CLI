package com.example.frame.service;


import com.example.common.util.JsonData;
import com.example.frame.model.request.AccountLoginRequest;
import com.example.frame.model.request.AccountRegisterRequest;

public interface AccountService{
    JsonData register(AccountRegisterRequest accountRegisterRequest);

    JsonData login(AccountLoginRequest accountLoginRequest);
}
