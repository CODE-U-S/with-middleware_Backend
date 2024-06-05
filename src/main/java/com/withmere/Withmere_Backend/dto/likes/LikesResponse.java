package com.withmere.Withmere_Backend.dto.likes;

import com.withmere.Withmere_Backend.domain.friend.Friend;
import com.withmere.Withmere_Backend.domain.likes.Likes;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.Getter;

@Getter
public class LikesResponse {
    private Post post;
    private User user;

    public LikesResponse(Likes l) {
        this.post = l.getPost();
        this.user = l.getUser();
    }
}
