/*
package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.dto.friend.FriendResponse;
import com.withmere.Withmere_Backend.repository.PostRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetPostService {
    private final GetPostService getPostService;
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    @Transactional
    public List<PostResponse> execute(String postTitle) {

        List<PostResponse> follows = postRepository.findByEmail(postTitle)
                .stream()
                .map(PostResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}
*/
