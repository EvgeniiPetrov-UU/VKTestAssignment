package com.vk.demo.service.entity.impl;

import com.vk.demo.dao.abstracts.CommentDao;
import com.vk.demo.model.entity.post.Comment;
import com.vk.demo.service.entity.abstracts.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentDao commentDao;

    public CommentServiceImpl(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @Override
    public List<Comment> getCommentsByPostId(Long id) {
        return commentDao.findCommentsByPost_Id(id);
    }
}
