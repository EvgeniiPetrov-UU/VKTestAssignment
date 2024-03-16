package com.vk.demo.service.entity.abstracts;

import com.vk.demo.model.entity.user.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);
}
