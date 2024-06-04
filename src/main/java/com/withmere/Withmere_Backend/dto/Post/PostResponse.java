package com.withmere.Withmere_Backend.dto.Post;

import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PostResponse {
    private final long post_id;
    private final User email;
    private final String post_title;
    private final String post_img;
    private final LocalDate start_date;
    private final LocalDate end_date;
    private final Modifier modifier;
    private final String post_description;

    public PostResponse(Post post) {
        this.post_id = post.getPost_id();
        this.email = post.getEmail();
        this.post_title = post.getPost_title();
        this.post_img = post.getPost_img();
        this.start_date = post.getStart_date();
        this.end_date = post.getEnd_date();
        this.modifier = post.getModifier();
        this.post_description = post.getPost_description();
    }
}
