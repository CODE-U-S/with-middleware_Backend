package com.withmere.Withmere_Backend.service.likes;

import com.withmere.Withmere_Backend.domain.likes.Likes;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.exception.LikesExistException;
import com.withmere.Withmere_Backend.exception.LikesNotFoundException;
import com.withmere.Withmere_Backend.repository.LikesRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteLikesService {
    private final LikesRepository lr;

    @Transactional
    public void execute(Post post, User user){
        // 일치하는 like 없을 시 + post랑 user null판단
        if(!lr.existsLike(post, user) || post == null || user == null) throw LikesNotFoundException.EXCEPTION;

        lr.deleteLike(post, user);
    }
}
