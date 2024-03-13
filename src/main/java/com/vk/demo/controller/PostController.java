package com.vk.demo.controller;

import com.vk.demo.model.dto.PostDto;
import com.vk.demo.model.entity.post.Comment;
import com.vk.demo.model.entity.post.Post;
import com.vk.demo.service.abstracts.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@Tag(name = "Post REST controller", description = "All operations with Post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @GetMapping
//    @Operation(summary = "Getting all posts")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Posts loaded successfully"),
//            @ApiResponse(responseCode = "400", description = "Posts not found")
//    })
//    public ResponseEntity<List<Post>> getAllPosts() {
//        return null;
//    }

    @GetMapping("/{id}")
    @Operation(summary = "Getting post by id")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Post loaded successfully"),
            @ApiResponse(responseCode = "400", description = "Post not found")
    })
    public ResponseEntity<PostDto> getPostById(@PathVariable Long id) {
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

//    @GetMapping("/{id}/comments")
//    @Operation(summary = "Getting all post's comments by it's id")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Comments loaded successfully"),
//            @ApiResponse(responseCode = "400", description = "Comments not found")
//    })
//    public ResponseEntity<List<Comment>> getCommentsByPostId(@PathVariable Long id) {
//        return null;
//    }
//
//    @PostMapping("/savePost")
//    @Operation(summary = "Getting post by id")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Post loaded successfully"),
//            @ApiResponse(responseCode = "400", description = "Post not found")
//    })
//    public ResponseEntity<Post> createPost(@RequestBody Post post) {
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
}
