package com.vk.demo.dao.abstracts;

import com.vk.demo.model.entity.post.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {

    List<Comment> findCommentsByPost_Id(Long id);
}
