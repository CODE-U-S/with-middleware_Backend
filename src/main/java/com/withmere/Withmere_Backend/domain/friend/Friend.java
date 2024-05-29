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

    private String toUser;

    @ManyToOne
    @JoinColumn(referencedColumnName = "email")
    private User fromUser;
}
