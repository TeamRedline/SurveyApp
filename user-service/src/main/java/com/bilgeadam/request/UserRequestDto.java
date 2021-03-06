package com.bilgeadam.request;

import com.bilgeadam.repository.entity.Teacher;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String email;
    private String password;
    private Long personId;
}
