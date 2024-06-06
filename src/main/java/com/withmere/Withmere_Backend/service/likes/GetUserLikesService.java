package com.withmere.Withmere_Backend.service.likes;

import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.likes.LikesResponse;
import com.withmere.Withmere_Backend.exception.UserNotFoundException;
import com.withmere.Withmere_Backend.repository.LikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetUserLikesService {
    private final LikesRepository lr;

    @Transactional
    public List<LikesResponse> execute(User user){
        if(user == null) throw UserNotFoundException.EXCEPTION;

        List<LikesResponse> userLikes = lr.findByUser(user)
                .stream()
                .map(LikesResponse::new)
                .collect(Collectors.toList());

        return userLikes;
    }
}
