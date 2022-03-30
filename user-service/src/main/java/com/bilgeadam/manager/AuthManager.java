package com.bilgeadam.manager;

import com.bilgeadam.request.UserRequestDto;
import com.bilgeadam.request.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "localhost:8083/auth", name = "userFeignClient", decode404 = true)
public interface AuthManager {

    @PostMapping("/save")
    UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto);
}
