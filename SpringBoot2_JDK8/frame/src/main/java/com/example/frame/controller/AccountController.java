package com.example.frame.controller;

import com.example.common.util.JsonData;
import com.example.frame.controller.request.AccountLoginRequest;
import com.example.frame.controller.request.AccountRegisterRequest;
import com.example.frame.service.AccountService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    /**
     * register
     * <p>
     * register user will get the free traffic.
     */

    @ApiOperation(value = "注册功能")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "token",value = "请求token",required = true,paramType = "header"),
//            @ApiImplicitParam(name = "file",value = "文件",required = true,paramType = "form",allowMultiple = true,dataType = "__File"),
//            @ApiImplicitParam(name = "name",value = "文件名称",required = true),
    })
    @PostMapping("register")
    public JsonData register(@RequestBody AccountRegisterRequest accountRegisterRequest) {
        return accountService.register(accountRegisterRequest);
    }

    @ApiOperation(value = "登录功能")
    @PostMapping("login")
    public JsonData login(@RequestBody AccountLoginRequest accountLoginRequest) {
        return accountService.login(accountLoginRequest);
    }


}
