package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserCommandService {
    void create(User user);

    void update(User user);

    void delete(Long id);
}
