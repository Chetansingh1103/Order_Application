package com.example.demo.Controllers;

import com.example.demo.Dtos.Request.UserRequestDto;
import com.example.demo.Services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/add") // API to add the new user
    public ResponseEntity<String> addUser(UserRequestDto userRequestDto){
        String response = userService.addUser(userRequestDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
