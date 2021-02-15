package com.adalog.service.blog;

import com.adalog.dao.blog.BlogCollectionRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogCollectionServiceImp implements BlogCollectionService {

  private BlogCollectionRepository blogCollectionRepository;

  public BlogCollectionServiceImp(BlogCollectionRepository blogCollectionRepository) {
    this.blogCollectionRepository = blogCollectionRepository;
  }

  @Override
  public String test() {
    return "testing";
  }
}
