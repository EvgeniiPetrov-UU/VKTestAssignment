package com.vk.demo.dao.abstracts;

import com.vk.demo.model.album.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumDao extends JpaRepository<Album, Long> {
}
