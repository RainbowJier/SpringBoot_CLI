package com.example.frame.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.frame.model.entity.Account;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
