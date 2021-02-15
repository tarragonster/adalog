package com.adalog.controller.blog;

import com.adalog.service.blog.BlogCollectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/blog-collection")
public class BlogCollectionController {

  private BlogCollectionService blogCollectionService;

  public BlogCollectionController(BlogCollectionService blogCollectionService) {
    this.blogCollectionService = blogCollectionService;
  }

  @GetMapping("/")
  public String test() {
    return blogCollectionService.test();
  }
}
