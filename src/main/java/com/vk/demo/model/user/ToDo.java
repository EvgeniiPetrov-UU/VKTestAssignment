package com.vk.demo.model.user;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "to_do")
public class ToDo implements Serializable {

    private static final long serialVersionUID = 3337928356772612402L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean completed = false;

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "user_id", nullable = false)
    @Nonnull
    private User user;

    public ToDo() {

    }

    public ToDo(Long id, Boolean completed, String title, User user) {
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.user = user;
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

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToDo{");
        sb.append("id=").append(id);
        sb.append(", completed=").append(completed);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return id.equals(toDo.id) && completed.equals(toDo.completed) && title.equals(toDo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completed, title);
    }
}
