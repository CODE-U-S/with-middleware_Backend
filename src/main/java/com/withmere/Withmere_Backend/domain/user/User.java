package com.withmere.Withmere_Backend.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.domain.friend.Friend;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends BaseTimeEntity {
    @Id
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String nickname;

    private String password;

    private String user_comment;

    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "fromUser", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Friend> toFromList;

    @Builder
    private User(String email){
        this.email = email;
    }
}
