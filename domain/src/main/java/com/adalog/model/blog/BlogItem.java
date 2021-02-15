package com.adalog.model.blog;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog_items")
public class BlogItem {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
  @SequenceGenerator(name = "sequenceGenerator")
  @Column(name = "id")
  private Long id;

  @Column(name = "title", nullable = false)
  private String title;

  @Lob
  @Column(name = "content", nullable = false)
  private String content;

  @Lob
  @Column(name = "image")
  private String image;

  @Lob
  @Column(name = "video")
  private String video;

  @ManyToOne
  @JoinColumn(name = "blog_collection_id", insertable = false, updatable = false)
  private BlogCollection blogCollection;

  @Column(name = "created_at", nullable = false)
  private Date createdAt;

  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;

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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public BlogCollection getBlogCollection() {
    return blogCollection;
  }

  public void setBlogCollection(BlogCollection blogCollection) {
    this.blogCollection = blogCollection;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  @PrePersist
  public void onCreatedAt() {
    this.createdAt = new Date();
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  @PreUpdate
  public void onUpdatedAt() {
    this.updatedAt = new Date();
  }
}
