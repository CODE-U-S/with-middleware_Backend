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
    private User toUser;
    private User fromUser;

    public Friend toEntity(User toUser, User fromUser) {
        return new Friend(toUser, fromUser);
    }
}
