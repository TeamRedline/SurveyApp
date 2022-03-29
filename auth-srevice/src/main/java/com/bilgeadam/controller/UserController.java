package com.bilgeadam.controller;

import com.bilgeadam.dto.UserRequestDto;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public User createUser(UserRequestDto userRequestDto){
       return userService.save(userRequestDto);
    }
}
