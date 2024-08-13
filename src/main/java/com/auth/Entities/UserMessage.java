package com.auth.Entities;

import lombok.Data;

@Data
public class UserMessage {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private String token;
}
