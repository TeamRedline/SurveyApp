package com.bilgeadam.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserResponseDto {
    private String email;
    private String password;
    private Long personId;
}
