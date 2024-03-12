package com.vk.demo.controller;

import com.vk.demo.model.post.Post;
import com.vk.demo.service.abstracts.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@Tag(name = "Post REST controller", description = "All operations with Post")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    @Operation(summary = "Get all posts")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Posts loaded successfully"),
            @ApiResponse(responseCode = "404", description = "Posts not found")
    })
    public ResponseEntity<List<Post>> getAllPosts() {
        return null;
    }
}
