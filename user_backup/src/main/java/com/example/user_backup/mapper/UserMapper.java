package com.example.user_backup.mapper;

import com.example.user_backup.domain.User_a;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User_a> findAll();
}
