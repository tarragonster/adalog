package com.adalog.controller.blog;

import com.adalog.service.blog.BlogCollectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/blog-collection")
public class BlogCollectionController {

  private final BlogCollectionService blogCollectionService;

  public BlogCollectionController(BlogCollectionService blogCollectionService) {
    this.blogCollectionService = blogCollectionService;
  }

  @GetMapping("/")
  public IllegalArgumentException test() {
    IllegalArgumentException exception = new  IllegalArgumentException("abc");
    return exception;
//    return blogCollectionService.test();
  }
}
