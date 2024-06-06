package com.withmere.Withmere_Backend.domain.post;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="post")
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long post_id;

    @ManyToOne
    @JoinColumn(name="email", nullable = false) //한 계정이 여러 게시판 생성 가능
    private User email;

    @Column(length=50)
    private String post_title;

    private String post_img;

    private LocalDate start_date; //게시판의 모집 시작 날짜

    private LocalDate end_date; //게시판의 모집 마감 날짜

    private Modifier modifier;

    @Column(length=3000)
    private String post_description;

    @Builder
    public Post(User email, String post_title, String post_img, LocalDate start_date, LocalDate end_date, Modifier modifier, String post_description) {
        this.email = email;
        this.post_title = post_title;
        this.post_img = post_img;
        this.start_date = start_date;
        this.end_date = end_date;
        this.modifier = modifier;
        this.post_description = post_description;
    }

    public void Update(String post_title, String post_img, LocalDate start_date, LocalDate end_date, Modifier modifier, String post_description){
        this.post_title = post_title;
        this.post_img = post_img;
        this.start_date = start_date;
        this.end_date = end_date;
        this.modifier = modifier;
        this.post_description = post_description;
    }
}
