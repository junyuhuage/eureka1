package com.offcn.service;

import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService  {
    @Autowired
    private UserMapper userMapper;


    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
