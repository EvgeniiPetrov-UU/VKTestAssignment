package com.vk.demo.model.post;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = -1885653560832153511L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String body;

    @Column
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Post.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment() {

    }

    public Comment(Long id, String name, String body, String email, Post post) {
        this.id = id;
        this.name = name;
        this.body = body;
        this.email = email;
        this.post = post;
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

    public void setEmail() {
        this.email = post.getUser().getEmail();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comment{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id.equals(comment.id) && name.equals(comment.name) && body.equals(comment.body) && email.equals(comment.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, body, email);
    }
}
