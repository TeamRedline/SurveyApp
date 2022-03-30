package com.bilgeadam.controller;

import com.bilgeadam.dto.UserRequestDto;
import com.bilgeadam.dto.UserResponseDto;
import com.bilgeadam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public UserResponseDto createUser(@RequestBody UserRequestDto requestDto){
       return userService.save(requestDto);
    }

    @GetMapping("/getUser")
    public String isUser(@RequestBody UserRequestDto requestDto){
        return userService.isUser(requestDto);
    }
}
