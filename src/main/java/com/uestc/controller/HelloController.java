package com.uestc.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 10:47
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('system:dept:list')")
    public String Hello(){
        return "hello";
    }
}
