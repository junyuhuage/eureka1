package com.offcn.controller;


import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("{id}")
    public User findById(@PathVariable(name = "id") Integer id){

        User user = restTemplate.getForObject("http://localhost:8091/user/{id}", User.class,id);
        System.out.println(user.toString());
        return  user;
    }

}
