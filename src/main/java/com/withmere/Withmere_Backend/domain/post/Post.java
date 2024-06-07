package com.withmere.Withmere_Backend.domain.post;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @JoinColumn(name = "email", nullable = false) //한 계정이 여러 게시판 생성 가능
    private User email;

    @OneToOne
    @JoinColumn(name = "postNickname", nullable = false)
    private User nickname;

    @Column(length = 50)
    private String postTitle;

    private String postImg;

    private LocalDate startDate; //게시판의 모집 시작 날짜

    private LocalDate endDate; //게시판의 모집 마감 날짜

    private Modifier modifier;

    private Ground ground; //무슨 분야인지.(project, delveloper...)

    private int division; //세부분야

    @Column(length = 3000)
    private String postDescription;

    @Builder
    public Post(User email, User nickname,
                String postTitle, String postImg,
                LocalDateTime createdDate, LocalDate startDate, LocalDate endDate,
                Modifier modifier, Ground ground, int division,
                String postDescription) {
        this.email = email;
        this.nickname = nickname;
        this.postTitle = postTitle;
        this.postImg = postImg;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modifier = modifier;
        this.ground = ground;
        this.division = division;
        this.postDescription = postDescription;
    }
}
