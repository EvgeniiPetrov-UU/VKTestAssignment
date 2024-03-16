package com.vk.demo.service.entity.impl;

import com.vk.demo.dao.abstracts.UserDao;
import com.vk.demo.model.entity.user.User;
import com.vk.demo.service.entity.abstracts.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Optional<User> getUserById(Long id) {
//        UserDto userDto = userDtoService.getUserDtoById(id);
//        User user = new User();
//
//        user.setId(userDto.getId());
//        user.setEmail(userDto.getEmail());
//        user.setEntityUsername(userDto.getUsername());
//        user.setName(userDto.getName());
//        user.setPhone(userDto.getPhone());
//        user.setWebsite(userDto.getWebsite());
//        user.setCompany(userDto.getCompany());
//        user.setAddress(userDto.getAddress());
        return userDao.findById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User '%s' not found", username));
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getUsername(), user.getAuthorities());
    }
}
