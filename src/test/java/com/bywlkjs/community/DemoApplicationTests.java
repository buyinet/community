package com.bywlkjs.community;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bywlkjs.community.Mapper.UserMapper;
import com.bywlkjs.community.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
       User user=userMapper.findByToken("b17a6cce-cb7f-466f-84ca-e04cd36ac139");
       System.out.println(user);
    }

}
