package com.vk.demo.service.dto.impl;

import com.vk.demo.model.dto.PostDto;
import com.vk.demo.service.dto.abstracts.PostDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PostDtoServiceImpl implements PostDtoService {
    private final WebClient webClient;

    @Autowired
    public PostDtoServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public PostDto getPostDtoById(Long id) {
        return webClient.get()
                .uri("/posts/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PostDto.class)
                .block();
    }
}
