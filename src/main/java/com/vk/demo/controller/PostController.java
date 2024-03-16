package com.vk.demo.controller;

import com.vk.demo.model.entity.post.Comment;
import com.vk.demo.model.entity.post.Post;
import com.vk.demo.service.entity.abstracts.CommentService;
import com.vk.demo.service.entity.abstracts.PostService;
import com.vk.demo.service.entity.abstracts.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
@Tag(name = "Post REST controller", description = "All operations with Post")
public class PostController {

    private final PostService postService;
    private final CommentService commentService;

    @Autowired
    public PostController(PostService postService,
                          CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping
    @Operation(summary = "Getting all posts")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Posts loaded successfully"),
            @ApiResponse(responseCode = "400", description = "Posts not found")
    })
    public ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Getting post by id")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Post loaded successfully"),
            @ApiResponse(responseCode = "400", description = "Post not found")
    })
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Optional<Post> post = postService.getPostById(id);

        if (post.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(post.get(), HttpStatus.OK);
    }

    @GetMapping("/{id}/comments")
    @Operation(summary = "Getting all post's comments by post id")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Comments loaded successfully"),
            @ApiResponse(responseCode = "400", description = "Comments not found")
    })
    public ResponseEntity<List<Comment>> getCommentsByPostId(@PathVariable Long id) {
        return new ResponseEntity<>(commentService.getCommentsByPostId(id), HttpStatus.OK);
    }

    @PostMapping("/savePost")
    @Operation(summary = "Saving post")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Post saved successfully"),
            @ApiResponse(responseCode = "400", description = "Post saving failure")
    })
    public ResponseEntity<?> createPost(@RequestBody Post post) {
        postService.savePost(post);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}/deletePost")
    @Operation(summary = "Deleting post")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Post deleted"),
            @ApiResponse(responseCode = "400", description = "Post deleting failure")
    })
    public ResponseEntity<?> deletePostById(@PathVariable Long id) {
        postService.deletePostById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}/updatePost")
    @Operation(summary = "Updating post")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Post updated"),
            @ApiResponse(responseCode = "400", description = "Post updating failure")
    })
    public ResponseEntity<?> updatePost(@RequestBody Post post) {
        postService.updatePost(post);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
