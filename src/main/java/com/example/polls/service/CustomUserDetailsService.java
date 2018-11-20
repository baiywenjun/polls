package com.example.polls.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.security.Security;

/**
 * Title: 实现认证对象
 * Description: Spring Security 使用 UserDetails 这个对象实现各种身份验证及权限认证
 * author: wenjun
 * date: 2018/11/20 22:09
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /*Note that, the loadUserByUsername() method returns a UserDetails object
        that Spring Security uses for performing various authentication and role based validations.*/
        return null;
    }
}
