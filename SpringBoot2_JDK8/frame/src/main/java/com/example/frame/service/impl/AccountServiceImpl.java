package com.example.frame.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.util.JsonData;
import com.example.frame.mapper.AccountMapper;
import com.example.frame.model.entity.Account;
import com.example.frame.model.request.AccountLoginRequest;
import com.example.frame.model.request.AccountRegisterRequest;
import com.example.frame.service.AccountService;
import jodd.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public JsonData register(AccountRegisterRequest accountRegisterRequest) {
        return null;
    }

    @Override
    public JsonData login(AccountLoginRequest accountLoginRequest) {
        return null;
    }
}
