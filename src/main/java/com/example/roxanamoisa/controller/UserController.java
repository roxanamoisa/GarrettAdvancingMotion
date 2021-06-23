package com.example.roxanamoisa.controller;

import com.example.roxanamoisa.entity.User;
import com.example.roxanamoisa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;

    @Autowired
    public void setUserService(UserService service) {this.service = service;}

    @GetMapping
    public ResponseEntity<Page<User>> findAllUsers(@RequestParam("page") int pageNumber,
                                                         @RequestParam("size") int size) {
        Page<User> users = service.findAllUsers(pageNumber, size);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
