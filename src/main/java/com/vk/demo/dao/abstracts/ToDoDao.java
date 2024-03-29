package com.vk.demo.dao.abstracts;

import com.vk.demo.model.entity.user.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoDao extends JpaRepository<ToDo, Long> {
}
