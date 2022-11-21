package com.uestc.handler;

import com.alibaba.fastjson.JSON;
import com.uestc.domain.ResponseResult;
import com.uestc.utils.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/21 17:54
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        //处理异常
        ResponseResult result = new ResponseResult(HttpStatus.UNAUTHORIZED.value(), "用户认证失败请查询登录");
        String josn = JSON.toJSONString(result);
        WebUtils.renderString(response, josn);
    }
}
