package com.withmere.Withmere_Backend.domain.user;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends BaseTimeEntity {
    @Id
    @Column(nullable = false, unique = true)
    private String email;

    private String nickname;

    private String password;

    private String user_comment;

    private Category category;
}
