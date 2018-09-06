package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User createUser(User user);

    User update(User user);

    void deleteUser(Integer id);

    User getUser(Integer id);

    Iterable<User> getAllUsers();
}
