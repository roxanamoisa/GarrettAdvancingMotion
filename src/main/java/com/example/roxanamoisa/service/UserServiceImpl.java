package com.example.roxanamoisa.service;

import com.example.roxanamoisa.entity.User;
import com.example.roxanamoisa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository repository;

    @Autowired
    public void setUserRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<User> findAllUsers(int pageNumber, int size) {
        Pageable page = PageRequest.of(pageNumber, size,
                Sort.by("lastName").descending().and(Sort.by("firstName").descending()));
        Page<User> users = repository.findAll(page);
        return users;
    }
}
