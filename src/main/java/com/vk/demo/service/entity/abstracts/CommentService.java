package com.vk.demo.service.entity.abstracts;

import com.vk.demo.model.entity.post.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentsByPostId(Long id);
}
