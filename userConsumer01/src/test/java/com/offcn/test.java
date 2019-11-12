package com.offcn;

import com.offcn.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class test {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test1( ) {

        User user = restTemplate.getForObject("http://localhost:8091/user/1", User.class);
        System.out.println(user);


    }
}
