package com.bilgeadam.service;

import com.bilgeadam.dto.UserRequestDto;
import com.bilgeadam.mapper.UserMapper;
import com.bilgeadam.repository.UserRepository;
import com.bilgeadam.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper mapper;

    public User save(UserRequestDto requestDto){
       return userRepository.save(mapper.toUser(requestDto));
    }
}
