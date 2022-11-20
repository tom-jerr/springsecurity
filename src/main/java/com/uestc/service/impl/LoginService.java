package com.uestc.service.impl;

import com.uestc.domain.ResponseResult;
import com.uestc.domain.User;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/20 18:38
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
