package com.example.users.mapper;

import com.example.users.domain.User_a;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User_a> findAll();
}
