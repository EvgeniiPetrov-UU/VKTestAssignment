package com.vk.demo.service.abstracts;

import com.vk.demo.model.dto.PostDto;

public interface PostService {

    PostDto getPostById(Long id);
}
