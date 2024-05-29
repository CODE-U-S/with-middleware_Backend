package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
