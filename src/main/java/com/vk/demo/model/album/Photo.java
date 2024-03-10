package com.vk.demo.model.album;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {

    private static final long serialVersionUID = 6583496467368903309L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String url;

    @Column
    private String thumbnailUrl;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Album.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "album_id", nullable = false)
    private Album album;

    public Photo() {

    }

    public Photo(Long id, String title, String url, String thumbnailUrl, Album album) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", thumbnailUrl='").append(thumbnailUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return id.equals(photo.id)
                && title.equals(photo.title)
                && url.equals(photo.url)
                && thumbnailUrl.equals(photo.thumbnailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, thumbnailUrl);
    }
}
