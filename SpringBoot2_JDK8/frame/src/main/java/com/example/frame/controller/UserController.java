package com.example.frame.controller;

import com.example.frame.aop.annotation.SysLogAnno;
import com.example.frame.controller.request.UserLoginRequest;
import com.example.frame.controller.request.UserRegisterRequest;
import com.example.frame.enums.OperationEnum;
import com.example.frame.service.UserService;
import com.example.frame.model.JsonData;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api/v1/account")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "注册功能")
    @SysLogAnno(description = "注册功能",operateType = OperationEnum.ADD)
    @PostMapping("register")
    public JsonData register(@RequestBody UserRegisterRequest userRegisterRequest) {
        return userService.register(userRegisterRequest);
    }

    @ApiOperation(value = "登录功能")
    @SysLogAnno(description = "登录功能",operateType = OperationEnum.QUERY)
    @PostMapping("login")
    public JsonData login(@RequestBody UserLoginRequest userLoginRequest) {
        return userService.login(userLoginRequest);
    }


    @ApiOperation(value = "根据id获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id")
    })
    @SysLogAnno(description = "根据id获取用户信息",operateType = OperationEnum.QUERY)
    @GetMapping("{id}")
    public JsonData getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @ApiOperation(value = "分页查询获取所有用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value = "第几页"),
            @ApiImplicitParam(name = "pageSize",value = "页大小")
            // 其他参数
    })
    @SysLogAnno(description = "分页查询获取所有用户信息",operateType = OperationEnum.QUERY)
    @GetMapping()
    public JsonData selectAll(@RequestParam int pageNum,
                                @RequestParam int pageSize) {
        return userService.selectAll(pageNum, pageSize);
    }


}
