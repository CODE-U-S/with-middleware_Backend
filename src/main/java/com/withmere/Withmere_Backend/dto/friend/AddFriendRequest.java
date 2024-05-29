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
    @NotNull(message = "보내는 유저의 email을 적어주세요.")
    private User toUser;

    @NotNull(message = "받는 유저의 email을 적어주세요.")
    private User fromUser;

    public Friend toEntity(User toUser, User fromUser) {
        return new Friend(toUser, fromUser);
    }
}
