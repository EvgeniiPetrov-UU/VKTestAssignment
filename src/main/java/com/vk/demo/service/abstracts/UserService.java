package com.vk.demo.service.abstracts;

import com.vk.demo.model.user.User;

public interface UserService {

    User getUserByUsername(String name);
}
