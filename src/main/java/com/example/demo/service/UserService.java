package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){

        return userMapper.Sel(id);

    }

    public User selectUser(int id) {
        User user = new User();
        user.setId(id);
        return userMapper.select(user);
    }


}
