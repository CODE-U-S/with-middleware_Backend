package com.withmere.Withmere_Backend.dto.friend;

import com.withmere.Withmere_Backend.domain.friend.Friend;
import com.withmere.Withmere_Backend.domain.user.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddFriendRequest {
    @NotNull(message = "이메일이 비어있습니다.")
    @Email(message = "이메일 형식이 아닙니다.")
    private String email;

    public Friend toEntity(String toUser, User fromUser) {
        return new Friend(toUser, fromUser);
    }
}
