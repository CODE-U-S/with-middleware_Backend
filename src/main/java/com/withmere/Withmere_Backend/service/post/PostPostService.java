/*
package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.exception.error.MissingFieldException;
import com.withmere.Withmere_Backend.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PostPostService {
    private final PostRepository postRepository;
    @Transactional
    public void execute(AddPostRequest postRequest) {
        //이메일이 없을 때
        if (postRequest.getEmail() == null) {
            throw new MissingFieldException("Email is required");
        }
        //title값이 없을 때
        if (postRequest.getPost_title() == null || postRequest.getPost_title().isEmpty()) {
            throw new MissingFieldException("Title is required");
        }
        //공개비공개친구만여부가 없을 때
        if (postRequest.getModifier() == null) {
            throw new MissingFieldException("Modifier is required");
        }
        //내용이 없을 떄
        if (postRequest.getPost_description() == null || postRequest.getPost_description().isEmpty()) {
            throw new MissingFieldException("Description is required");
        }

        Post post = postRequest.toEntity();
        postRepository.save(post);
    }
}
*/
