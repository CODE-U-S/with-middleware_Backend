package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.likes.Likes;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikesRepository extends JpaRepository<Likes, Long> {
    boolean existsByPostAndUser(Post post, User user);
    void deleteByPostAndUser(Post post, User user);
    List<Likes> findByPost(Post post);
    List<Likes> findByUser(User user);
}
