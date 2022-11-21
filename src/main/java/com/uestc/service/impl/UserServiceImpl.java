package com.uestc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.uestc.domain.LoginUser;
import com.uestc.domain.User;
import com.uestc.mapper.MenuMapper;
import com.uestc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 16:36
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, username);
        User user = userMapper.selectOne(queryWrapper);
        if (Objects.isNull(user)){
            throw new RuntimeException("用户名或者密码错误");
        }

        //TODO 查询对应的权限信息
        List<String> permissionKeylist = menuMapper.selectPermsByUserId(user.getId());

        return new LoginUser(user,permissionKeylist);
    }
}
