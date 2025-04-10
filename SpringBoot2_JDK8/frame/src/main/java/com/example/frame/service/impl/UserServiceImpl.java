package com.example.frame.service.impl;

import com.example.frame.controller.request.UserLoginRequest;
import com.example.frame.controller.request.UserRegisterRequest;
import com.example.frame.mapper.UserMapper;
import com.example.frame.model.entity.User;
import com.example.frame.service.UserService;
import com.example.frame.utils.JsonData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.vertx.core.json.Json;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public JsonData register(UserRegisterRequest userRegisterRequest) {
        return JsonData.buildSuccess();
    }

    @Override
    public JsonData login(UserLoginRequest userLoginRequest) {
        return JsonData.buildSuccess();
    }

    @Override
    public JsonData getUserById(String id) {
        return null;
    }

    @Override
    public JsonData selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize); // 启动分页

        List<User> list = userMapper.selectAll(); // 查询所有用户

        // 转换为PageInfo对象
        PageInfo<User> pageInfo = new PageInfo<>(list);

        return JsonData.buildSuccess(pageInfo);
    }
}
