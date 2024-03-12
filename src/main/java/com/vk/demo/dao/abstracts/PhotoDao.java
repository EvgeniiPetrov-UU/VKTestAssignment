package com.vk.demo.dao.abstracts;

import com.vk.demo.model.album.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoDao extends JpaRepository<Photo, Long> {
}
