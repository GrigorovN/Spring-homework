package com.example.homework.service;

import com.example.homework.convertor.UserConvertor;
import com.example.homework.dto.UserRegisterRequest;
import com.example.homework.dto.UserResponse;
import com.example.homework.entity.User;
import com.example.homework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserConvertor userConverter;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserConvertor userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public UserResponse saveUser(UserRegisterRequest request) {
        User user = userConverter.toUser(request);

        User savedUser = userRepository.save(user);

        return userConverter.toResponse(savedUser);
    }

    @Override
    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id).get();
        return userConverter.toResponse(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
