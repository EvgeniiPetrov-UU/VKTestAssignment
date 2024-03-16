package com.vk.demo.service.entity.impl;

import com.vk.demo.dao.abstracts.PostDao;
import com.vk.demo.model.entity.post.Post;
import com.vk.demo.service.entity.abstracts.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostDao postDao;

    @Autowired
    public PostServiceImpl(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public Optional<Post> getPostById(Long id) {
//        PostDto postDto = postDtoService.getPostDtoById(id);
//        Optional<User> user = userService.getUserById(postDto.getUserId());
//
//        Post post = new Post();
//        post.setId(postDto.getId());
//        post.setTitle(postDto.getTitle());
//        post.setBody(postDto.getBody());
//        user.ifPresent(post::setUser);
        return postDao.findById(id);
    }

    @Override
    public List<Post> getAllPosts() {
        return postDao.findAll();
    }

    @Override
    public void deletePostById(Long id) {
        postDao.deleteById(id);
    }

    @Override
    public void savePost(Post post) {
        postDao.save(post);
    }

    @Override
    public void updatePost(Post post) {
        postDao.save(post);
    }
}
