package com.example.demo.Services.Impl;

import com.example.demo.Convertors.Request.UserRequestDtoConvertor;
import com.example.demo.Dtos.Request.UserRequestDto;
import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(UserRequestDto userRequestDto){
        //creating user entity by taking the values from UI using userRequestDto
        User user = UserRequestDtoConvertor.convertDtoToEntity(userRequestDto);

        userRepository.save(user);

        return "User has been added";
    }
}
