package com.adalog.dao.blog;

import com.adalog.model.blog.BlogCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCollectionRepository extends JpaRepository<BlogCollection, Long> {
}
