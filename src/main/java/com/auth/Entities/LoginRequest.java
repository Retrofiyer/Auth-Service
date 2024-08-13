package com.auth.Entities;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
