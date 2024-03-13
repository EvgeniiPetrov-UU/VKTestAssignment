package com.vk.demo.model.dto;

public class ToDoDto {

    private Long id;
    private Boolean completed;
    private String title;
    private Long userId;

    public ToDoDto() {

    }

    public ToDoDto(Long id, Boolean completed, String title, Long userId) {
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
