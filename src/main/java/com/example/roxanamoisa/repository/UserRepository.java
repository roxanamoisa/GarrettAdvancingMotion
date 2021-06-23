package com.example.roxanamoisa.repository;

import com.example.roxanamoisa.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
