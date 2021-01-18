package com.cdc.service;

import com.cdc.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User queryUserByName(String name);
}
