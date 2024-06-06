package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.post.Post;
//<<<<<<< HEAD
import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByEmail(User email);
//    void deletePost(User email, String post_title);
//    List<Post> findById(Long id);
}
//=======
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface PostRepository extends JpaRepository<Post, Long> {
//}
//>>>>>>> 00e6f76cee24975f9faa17cb37f1d29504d83e66
