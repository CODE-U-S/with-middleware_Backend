package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    boolean existsByEmailAndPostTitle(User email, String postTitle);
    void deleteByEmailAndPostTitle(User email, String postTitle);

    List<Post> findByPostTitle(String postTitle);
    List<Post> findByGround(Ground ground);
    List<Post> findByDivision(int division);
    //List<Post> findByStartDateAndEndDate(LocalDate startDate, LocalDate endDate);
    //List<Post> findByEndDate(LocalDate endDate, LocalDate startDate);
}
