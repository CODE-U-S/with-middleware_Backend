package com.withmere.Withmere_Backend.dto.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;

public class PostResponse {
    private final Post post_id;
    private final User email;
    private final Post post_title;
    private final Post post_img;
    private final Post start_date; //게시판의 모집 시작 날짜
    private final Post end_date; //게시판의 모집 마감 날짜
    private final Post modifier;
    private final Post post_description;

    public PostResponse(Post follow) {
        this.post_id = follow.getPost_id();
        this.email = follow.getEmail();
        this.post_title = follow.getPost_title();
        this.post_img = follow.getPost_img();
        this.start_date = follow.getStart_date();
        this.end_date = follow.getEnd_date();
        this.modifier = follow.getModifier();
        this.post_description = follow.getPost_description();
    }
}
