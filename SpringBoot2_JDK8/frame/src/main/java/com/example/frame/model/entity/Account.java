package com.example.frame.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * account number
     */
    private Long accountNo;

    /**
     * avatar
     */
    private String headImg;

    /**
     * phone number
     */
    private String phone;

    /**
     * password
     */
    private String pwd;

    /**
     * To process sensitive personal information.
     */
    private String secret;

    /**
     * email
     */
    private String mail;

    /**
     * username
     */
    private String username;

    /**
     * Certification Level: DEFAULT, REALNAME, ENTERPRISE, the numer of visits is different.
     */
    private String auth;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;


}
