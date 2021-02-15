package com.adalog.model.blog;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "blog_items")
public class BlogCollection {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
  @SequenceGenerator(name = "sequenceGenerator")
  @Column(name = "id")
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @OneToMany(targetEntity = BlogItem.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private Set<BlogItem> blogItems;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<BlogItem> getBlogItems() {
    return blogItems;
  }

  public void setBlogItems(Set<BlogItem> blogItems) {
    this.blogItems = blogItems;
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