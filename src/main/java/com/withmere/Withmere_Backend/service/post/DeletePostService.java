package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.exception.error.PostNotFoundException;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeletePostService {
    private final PostRepository postRepository;
    @Transactional
    public void DeletePostService(String email, String postTitle) {
        // 이메일이 일치하는 포스트 찾기.
        List<Post> posts = postRepository.findByEmail(email);

        // 포스트를 찾지 못한 경우 예외를 던집니다.
        if(posts.isEmpty()) {
            throw new PostNotFoundException("No posts found for the given email: " + email);
        }

        // 주어진 제목을 가진 포스트를 삭제합니다.
        for(Post post : posts) {
            if(post.getPost_title().equals(postTitle)) {
                postRepository.delete(post);
                return;
            }
        }

        // 삭제할 포스트를 찾지 못한 경우 예외를 던집니다.
        throw new PostNotFoundException("No post found with title: " + postTitle);
    }

    public void execute(User email, String postTitle) {
        postRepository.deletePost(email, postTitle);
    }
}
