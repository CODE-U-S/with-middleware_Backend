package com.withmere.Withmere_Backend.dto.Post;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.post.Ground;
import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PostResponse {
    private final Long postId;
    private final User email;
    private final String postTitle;
    private final String postImg;
    private final LocalDateTime createDate;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Modifier modifier;
    private final Ground ground;
    private final int division;
    private final String postDescription;

    public PostResponse(Post follow) {
        this.postId = follow.getPost_id();
        this.email = follow.getEmail();
        this.postTitle = follow.getPostTitle();
        this.postImg = follow.getPostImg();
        this.createDate = follow.getCreatedDate();
        this.startDate = follow.getStartDate();
        this.endDate = follow.getEndDate();
        this.modifier = follow.getModifier();
        this.ground = follow.getGround();
        this.division = follow.getDivision();
        this.postDescription = follow.getPostDescription();
    }
}
