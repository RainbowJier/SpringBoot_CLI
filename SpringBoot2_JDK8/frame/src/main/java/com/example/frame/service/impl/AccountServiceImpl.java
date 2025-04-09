package com.example.frame.service.impl;

import com.example.common.util.JsonData;
import com.example.frame.controller.request.AccountLoginRequest;
import com.example.frame.controller.request.AccountRegisterRequest;
import com.example.frame.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public JsonData register(AccountRegisterRequest accountRegisterRequest) {
        return JsonData.buildSuccess();
    }

    @Override
    public JsonData login(AccountLoginRequest accountLoginRequest) {
        return JsonData.buildSuccess();
    }
}
