package com.example.homework.convertor;

import com.example.homework.dto.UserRegisterRequest;
import com.example.homework.dto.UserResponse;
import com.example.homework.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConvertor {

    public User toUser(UserRegisterRequest request){
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

    public UserResponse toResponse(User savedUser){
        return new UserResponse(
                savedUser.getEmail(),
                savedUser.getFirstName(),
                savedUser.getLastName());
    }
}
