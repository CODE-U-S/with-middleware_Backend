/*
package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostUpdateService {

    @Autowired
    private PostRepository postRepository;

    public PostResponse updatePost(Long postId, AddPostRequest addPostRequest) {
        List<Post> postList = postRepository.findById(postId);

        if (!postList.isEmpty()) {
            Post post = postList.get(0); // List에서 첫 번째 요소를 가져옵니다.
            post.setPostTitle(addPostRequest.getPost_title());
            post.setPostImg(addPostRequest.getPost_img());
            post.setStartDate(addPostRequest.getStart_date());
            post.setEndDate(addPostRequest.getEnd_date());
            post.setModifier(addPostRequest.getModifier());
            post.setPostDescription(addPostRequest.getPost_description());
            Post updatedPost = postRepository.save(post);
            return new PostResponse(updatedPost); // PostResponse 생성자에 맞게 조정하세요
        } else {
            throw new RuntimeException("Post not found");
        }
    }
}*/
