package com.withmere.Withmere_Backend.domain.friend;

import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

//Friend는 친구 목록과 동시에 요청목록 창 입니다.

@Getter
@Entity
@Table(name="friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long request_id;

    @ManyToOne
    @JoinColumn(name="email", nullable = false) // 하나의 계정이 여러 요청 가능
    private User email;

    @ManyToOne
    @JoinColumn(name="friend_email", nullable = false)
    private User friend_email;

    private Status status;
}
