package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetPostGroundService {
    private final PostRepository postRepository;
    @Transactional
    public List<PostResponse> execute(Ground ground) {

        List<PostResponse> follows = postRepository.findByGround(ground)
                .stream()
                .map(PostResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}
