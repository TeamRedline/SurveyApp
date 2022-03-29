package com.bilgeadam.request;

import com.bilgeadam.repository.entity.Teacher;
import lombok.*;

@Getter
@Setter
@ToString
public class UserRequestDto {
    private String email;
    private String password;
    private Long personId;

    public UserRequestDto(Teacher teacher) {
        this.email = teacher.getEmail();
        this.password = teacher.getPassword();
        this.personId = teacher.getId();
    }
}
