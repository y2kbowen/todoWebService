package com.learning.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable() // This is cross site forgery request prevention. We will use JWT tokens, do disable
        .authorizeRequests()
        .antMatchers(HttpMethod.OPTIONS,"/**").permitAll() // Allow options request from any url
        .anyRequest().authenticated()
        // .and().formLogin()
        .and().httpBasic();  // we will use httpbasic authenitcation for all requests and disable forms login
    }

}
