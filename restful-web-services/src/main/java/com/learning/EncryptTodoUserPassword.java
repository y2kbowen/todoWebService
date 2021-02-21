package com.learning;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptTodoUserPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode("1Password");

        System.out.println(encodedPassword);

        
    }
}
