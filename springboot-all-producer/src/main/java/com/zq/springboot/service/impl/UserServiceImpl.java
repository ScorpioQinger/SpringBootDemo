package com.zq.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zq.springboot.mapper.UserMapper;
import com.zq.springboot.model.User;
import com.zq.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Service(version = "1.0.0")//dubbo的注解
@Component//spring注解
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserByPage(Map<String, Object> paramMap) {

        return userMapper.selectUserByPage(paramMap);
    }

    @Override
    public int getUserByTotal() {

        return userMapper.selectUserByTotal();
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int delUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getUserByUid(int uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
