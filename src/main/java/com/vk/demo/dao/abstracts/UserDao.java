package com.vk.demo.dao.abstracts;

import com.vk.demo.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
