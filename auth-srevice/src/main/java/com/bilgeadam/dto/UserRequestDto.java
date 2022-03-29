package com.bilgeadam.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserRequestDto {
    private String email;
    private String password;
    private Long personId;
}
