package com.withmere.Withmere_Backend.domain.friend;

import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

//Friend는 친구 목록과 동시에 요청목록 창 입니다.

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private User toUser;

    @ManyToOne
    @JoinColumn
    private User fromUser;

    @Builder
    public Friend(User toUser, User fromUser) {
        this.toUser = toUser;
        this.fromUser = fromUser;
    }
}
