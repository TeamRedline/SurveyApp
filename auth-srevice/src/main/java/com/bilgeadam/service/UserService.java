package com.bilgeadam.service;

import com.bilgeadam.dto.UserRequestDto;
import com.bilgeadam.dto.UserResponseDto;
import com.bilgeadam.mapper.UserMapper;
import com.bilgeadam.repository.UserRepository;
import com.bilgeadam.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper mapper;

    public UserResponseDto save(UserRequestDto requestDto){
       return mapper.toUserResponseDto(userRepository.save(mapper.toUser(requestDto)));
    }

    public String isUser(UserRequestDto requestDto){
        Optional<User> userOpt = userRepository.findByEmailAndPassword(mapper.toUser(requestDto));
        if(userOpt.isPresent())
            return "true";
        return "false";
    }
}
