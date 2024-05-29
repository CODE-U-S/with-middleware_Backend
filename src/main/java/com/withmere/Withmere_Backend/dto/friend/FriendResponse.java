package com.withmere.Withmere_Backend.dto.friend;

import com.withmere.Withmere_Backend.domain.friend.Friend;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.Getter;

@Getter
public class FriendResponse {
    private final String toUser;
    private final User fromUser;

    public FriendResponse(Friend follow) {
        this.toUser = follow.getToUser();
        this.fromUser = follow.getFromUser();
    }
}
