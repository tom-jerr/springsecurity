package com.uestc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestc.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 16:30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
