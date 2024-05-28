package com.withmere.Withmere_Backend.domain.post;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
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
}
