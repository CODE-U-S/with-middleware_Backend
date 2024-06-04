package com.withmere.Withmere_Backend.dto.Post;

import com.withmere.Withmere_Backend.domain.post.Modifier;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddPostRequest {
    private User email;
    private String post_title;
    private String post_img;
    private LocalDate start_date; //게시판의 모집 시작 날짜
    private LocalDate end_date; //게시판의 모집 마감 날짜
    private Modifier modifier; //공개 비공개
    private String post_description; //설명

    public Post toEntity() {
        return Post.builder()
                .email(email)
                .post_title(post_title)
                .post_img(post_img)
                .start_date(start_date)
                .end_date(end_date)
                .modifier(modifier)
                .post_description(post_description)
                .build();
    }
}
