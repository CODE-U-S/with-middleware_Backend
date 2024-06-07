package com.withmere.Withmere_Backend.dto.Post;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddPostRequest {
    private User email;
    private User nickname;
    private String postTitle;
    private String postImg;
    private LocalDateTime createdDate;
    private LocalDate startDate; //게시판의 모집 시작 날짜
    private LocalDate endDate; //게시판의 모집 마감 날짜
    private Modifier modifier;
    private Ground ground;
    private int division;
    private String postDescription;

    public Post postEntity(User email, User nickname, String postTitle, String postImg,
                           LocalDateTime createdDate, LocalDate startDate, LocalDate endDate,
                           Modifier modifier, Ground ground, int division, String postDescription) {
        return new Post(email, nickname, postTitle, postImg, createdDate, startDate, endDate, modifier, ground, division, postDescription);
    }
}
