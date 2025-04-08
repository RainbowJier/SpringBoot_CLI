package com.example.frame.controller.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎用户账号登录
 * @Date: 2024/10/5 16:12
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginRequest {

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "密码")
    private String pwd;
}
