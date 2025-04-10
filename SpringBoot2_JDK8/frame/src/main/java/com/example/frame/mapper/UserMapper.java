package com.example.frame.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.frame.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();
}
