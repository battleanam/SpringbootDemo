package com.example.demo.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User getUserName(String id);
}
