/*
package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostUpdateService {
    private final PostRepository postRepository;

    public PostResponse updatePost(Long postId, AddPostRequest addPostRequest) {
        Optional<Post> postList = postRepository.findById(postId);

        Optional<Object> optionalPost = null;
        if (optionalPost.isPresent()) {
            Object post = optionalPost.get();
            // 수정할 내용 설정
            post.setPostTitle(addPostRequest.getPostTitle());
            post.setPostImg(addPostRequest.getPostImg());
            post.setStartDate(addPostRequest.getStartDate());
            post.setEndDate(addPostRequest.getEndDate());
            post.setModifier(addPostRequest.getModifier());
            post.setPostDescription(addPostRequest.getPostDescription());

            // 수정된 포스트 저장
            Post updatedPost = postRepository.save(post);

            // 수정된 포스트를 응답으로 반환
            return new PostResponse(updatedPost);
        } else {
            throw new PostNotFoundException("Post not found");
        }
    }
}
*/