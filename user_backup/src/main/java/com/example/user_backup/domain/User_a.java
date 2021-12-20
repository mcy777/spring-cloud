package com.example.user_backup.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User_a {
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;

    public User_a(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
