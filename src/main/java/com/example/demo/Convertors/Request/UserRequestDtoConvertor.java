package com.example.demo.Convertors.Request;

import com.example.demo.Dtos.Request.UserRequestDto;
import com.example.demo.Models.User;

public class UserRequestDtoConvertor {
    public static User convertDtoToEntity(UserRequestDto userRequestDto){
        return User.builder()
                .username(userRequestDto.getUsername())
                .email(userRequestDto.getEmail())
                .password(userRequestDto.getPassword())
                .build();
    }
}
