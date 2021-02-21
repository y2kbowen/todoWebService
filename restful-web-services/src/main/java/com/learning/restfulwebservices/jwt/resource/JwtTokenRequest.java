package com.learning.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {
    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

    // {
    //     "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxNDQ0OTQ3MywiaWF0IjoxNjEzODQ0NjczfQ.zfFs-bgkTLiKpPhTqsMqU9nDGADUSO88EDzPBYOsjq-9LWf7D94skCUEsEJzjPzlkUwyK15ORTwQE2mj8PQMjQ"
    // }
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
