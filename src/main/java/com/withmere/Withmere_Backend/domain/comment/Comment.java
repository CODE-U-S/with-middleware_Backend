package com.withmere.Withmere_Backend.domain.comment;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="comment")
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comment_id;

    @ManyToOne
    @JoinColumn(name="post_id", nullable = false) //포스트 하나당 여러 댓글 달기 가능
    private Post post_id;

    @ManyToOne
    @JoinColumn(name="email", nullable = false) //하나의 계정이 여러 댓글 달기 가능
    private User email;

    @Column(length=300)
    private String comment;
}
