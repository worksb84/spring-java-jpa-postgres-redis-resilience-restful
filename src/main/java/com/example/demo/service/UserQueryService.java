package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.User;

public interface UserQueryService {
    Optional<User> get(Long id);

    List<User> all();
}
