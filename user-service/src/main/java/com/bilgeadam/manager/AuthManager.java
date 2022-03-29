package com.bilgeadam.manager;

import com.bilgeadam.request.UserRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8083/auth", name = "userFeignClient", decode404 = true)
public interface AuthManager {

    @PostMapping("/save")
    User createUser(UserRequestDto userRequestDto);
}
