package com.hyperbench.hyperbench.springboot;


import com.hyperbench.hyperbench.springboot.domain.User;
import com.hyperbench.hyperbench.springboot.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void test() throws Exception {

        int i=0;
        while(true){
            userMapper.insert("AAA", i);
            i++;
            if(i==500) break;
        }
//        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(20, u.getAge().intValue());
    }
}
