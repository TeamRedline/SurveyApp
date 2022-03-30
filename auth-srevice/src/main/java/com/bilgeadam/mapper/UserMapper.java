package com.bilgeadam.mapper;

import com.bilgeadam.dto.UserRequestDto;
import com.bilgeadam.dto.UserResponseDto;
import com.bilgeadam.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

   User toUser(UserRequestDto requestDto);

   UserResponseDto toUserResponseDto(User user);

}
