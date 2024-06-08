package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.exception.EmailTitleDuplaicateException;
import com.withmere.Withmere_Backend.exception.StartCannotEndException;
import com.withmere.Withmere_Backend.exception.StartDatePastException;
import com.withmere.Withmere_Backend.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PostPostService {
    private final PostRepository postRepository;

    @Transactional
    public void execute(AddPostRequest request) {
        User email = request.getEmail(); // 이메일을 문자열로 받아옴
        //User nickname = request.getNickname();
        String postTitle = request.getPostTitle();
        String postImg = request.getPostImg();
        Modifier modifier = request.getModifier();
        LocalDate startDate = request.getStartDate();
        LocalDate endDate = request.getEndDate();
        Ground ground = request.getGround();
        int division = request.getDivision();
        String postDescription = request.getPostDescription();

        // 이메일과 제목을 가진 게시물이 이미 존재하면 예외 발생
        if (postRepository.existsByEmailAndPostTitle(email, postTitle)) {
            throw new EmailTitleDuplaicateException();
        }
        // 이메일과 닉네임이 일치하지 않으면 예외 발생
//        if (!email.getNickname().equals(nickname)) {
//            throw new EmailNicknameMismatchException();
//        }

        // 시작 날짜가 종료 날짜보다 미래면 예외 발생
        if (startDate != null && endDate != null && startDate.isAfter(endDate)) {
            throw new StartCannotEndException();
        }

        // 시작 날짜가 과거면 예외 발생
        if (startDate != null && startDate.isBefore(LocalDate.now())) {
            throw new StartDatePastException();
        }
        // 유저테이블의 이메일과 닉네임이 같지 않으면 예외 발생

        // 모든 예외 조건을 통과하면 게시물 저장
        postRepository.save(request.postEntity(email, postTitle, postImg, startDate, endDate, modifier, ground, division, postDescription));
    }
}