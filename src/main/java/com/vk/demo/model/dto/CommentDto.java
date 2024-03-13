package com.vk.demo.model.dto;

public class CommentDto {

    private Long id;
    private String name;
    private String body;
    private String email;
    private Long postId;

    public CommentDto() {

    }

    public CommentDto(Long id, String name, String body, String email, Long postId) {
        this.id = id;
        this.name = name;
        this.body = body;
        this.email = email;
        this.postId = postId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
