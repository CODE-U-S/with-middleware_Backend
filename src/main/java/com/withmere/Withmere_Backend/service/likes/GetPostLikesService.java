package com.withmere.Withmere_Backend.service.likes;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.dto.likes.LikesResponse;
import com.withmere.Withmere_Backend.repository.LikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetPostLikesService {
    private final LikesRepository lr;

    @Transactional
    public List<LikesResponse> execute(Post post){
        // if(post == null) PostNotFoundException

        List<LikesResponse> postLikes = lr.findByPost(post)
                .stream()
                .map(LikesResponse::new)
                .collect(Collectors.toList());

        return postLikes;
    }
}
