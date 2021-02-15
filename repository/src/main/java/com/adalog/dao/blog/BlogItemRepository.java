package com.adalog.dao.blog;

import com.adalog.model.blog.BlogItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogItemRepository extends JpaRepository<BlogItem, Long> {
}
