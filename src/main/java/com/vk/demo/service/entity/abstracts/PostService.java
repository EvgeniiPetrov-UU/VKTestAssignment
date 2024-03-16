package com.vk.demo.service.entity.abstracts;

import com.vk.demo.model.entity.post.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> getPostById(Long id);
    List<Post> getAllPosts();
    void deletePostById(Long id);
    void savePost(Post post);
    void updatePost(Post post);
}
