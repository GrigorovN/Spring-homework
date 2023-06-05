package com.example.homework.service;

import com.example.homework.dto.UserRegisterRequest;
import com.example.homework.dto.UserResponse;

public interface UserService {

    UserResponse saveUser(UserRegisterRequest request);

    UserResponse getUser(Long id);

    void deleteUser(Long id);
}
