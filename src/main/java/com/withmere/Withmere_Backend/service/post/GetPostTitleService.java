package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetPostTitleService {
    private final PostRepository postRepository;
    @Transactional
    public List<PostResponse> execute(String postTitle) {

        List<PostResponse> follows = postRepository.findByPostTitle(postTitle)
                .stream()
                .map(PostResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}