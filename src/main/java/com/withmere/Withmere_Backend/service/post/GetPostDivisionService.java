package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetPostDivisionService {
    private final PostRepository postRepository;
    @Transactional
    public List<PostResponse> execute(int division) {

        List<PostResponse> follows = postRepository.findByDivision(division)
                .stream()
                .map(PostResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}
