package com.uestc;

import com.uestc.domain.User;
import com.uestc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 16:32
 */
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestBPasswordEncoder(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);
        boolean matches = passwordEncoder.matches("1234", "$2a$10$KkAPZI6q.OIIrTS/r9x77enbqOFeuYwGAfFJPM0u5Jvd8D8Hm6y3W");
        System.out.println(matches);
    }

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
