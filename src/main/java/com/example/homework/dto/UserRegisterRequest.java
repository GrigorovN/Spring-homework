package com.example.homework.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegisterRequest {
    @NotBlank
    @Length(min =2)
    private String firstName;
    @NotBlank
    @Length(min = 2)
    private String lastName;
    @Email(message = "Enter your email")
    private String email;
  @Length(min = 8, max = 100,message = "Do not use your name as a password")
    private String password;

}
