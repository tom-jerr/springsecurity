package com.uestc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestc.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/21 11:03
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}
