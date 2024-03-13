package com.vk.demo.service.impl;

import com.vk.demo.model.dto.PostDto;
import com.vk.demo.service.abstracts.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PostServiceImpl implements PostService {

    private final WebClient webClient;

    @Autowired
    public PostServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    public PostDto getPostById(Long id) {
        return webClient.get()
                .uri("/posts/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PostDto.class).block();
    }
}
