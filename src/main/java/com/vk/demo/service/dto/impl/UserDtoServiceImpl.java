package com.vk.demo.service.dto.impl;

import com.vk.demo.model.dto.UserDto;
import com.vk.demo.service.dto.abstracts.UserDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UserDtoServiceImpl implements UserDtoService {

    private final WebClient webClient;

    @Autowired
    public UserDtoServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public UserDto getUserDtoById(Long id) {
        return webClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .bodyToMono(UserDto.class)
                .block();
    }
}
