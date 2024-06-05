package com.withmere.Withmere_Backend.domain.likes;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//게시판 좋아요 파악하기

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long like_id;

    @ManyToOne
    @JoinColumn(name="post_id", nullable = false)//하나의 게시판에 여러 좋아요 가능
    private Post post;

    @ManyToOne
    @JoinColumn(name="email", nullable = false)
    private User user;

    @Builder
    public Likes(Post post, User user){
        this.post = post;
        this.user = user;
    }
}
