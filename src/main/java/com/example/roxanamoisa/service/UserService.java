package com.example.roxanamoisa.service;

import com.example.roxanamoisa.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> findAllUsers(int pageNumber, int size);
}
