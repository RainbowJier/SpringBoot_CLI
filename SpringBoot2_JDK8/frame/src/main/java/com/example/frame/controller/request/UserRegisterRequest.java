package com.example.frame.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎账号注册实体类
 * @Date: 2024/10/5 14:28
 * @Version: 1.0
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户注册请求实体类")
public class UserRegisterRequest {
    @ApiModelProperty(value = "头像地址")
    private String headImg;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "邮箱")
    private String mail;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "验证码")
    private String code;

}
