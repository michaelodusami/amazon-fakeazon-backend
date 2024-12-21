package com.github.michaelodusami.fakeazon.modules.user.dto;


import com.github.michaelodusami.fakeazon.modules.user.entity.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RegisterRequest {
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3)
    private String password;

    public static RegisterRequest toRegisterRequest(User user)
    {
        return new RegisterRequest(user.getName(), user.getEmail(), user.getPassword());
    }
}
