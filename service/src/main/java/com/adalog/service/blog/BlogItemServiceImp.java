package com.adalog.service.blog;

import com.adalog.dao.blog.BlogItemRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogItemServiceImp {
  private BlogItemRepository blogItemRepository;

  public BlogItemServiceImp(BlogItemRepository blogItemRepository) {
    this.blogItemRepository = blogItemRepository;
  }
}
