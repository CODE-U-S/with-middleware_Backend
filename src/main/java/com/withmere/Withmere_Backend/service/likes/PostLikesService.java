package com.withmere.Withmere_Backend.service.likes;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.likes.AddLikesRequest;
import com.withmere.Withmere_Backend.exception.LikesExistException;
import com.withmere.Withmere_Backend.repository.LikesRepository;
import com.withmere.Withmere_Backend.repository.PostRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostLikesService {
    private final LikesRepository lr;

    @Transactional
    public void execute(AddLikesRequest r){
        Post post = r.getPost();
        User user = r.getUser();

        //고려 하지 않은 상황 : 없는 게시판일 경우, 없는 회원일 경우

        //post와 user 둘 다 일치하는 결과가 있을 때
        if(lr.existsPostAndUser(post, user)) throw LikesExistException.EXCEPTION;

        lr.save(r.toEntity(post, user));
    }
}
