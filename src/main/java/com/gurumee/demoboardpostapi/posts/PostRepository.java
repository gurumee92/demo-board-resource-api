package com.gurumee.demoboardpostapi.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByOwnerName(@Param("username") String username);
    List<Post> findByTitleContainingOrContentContaining(String title, String content);
}
