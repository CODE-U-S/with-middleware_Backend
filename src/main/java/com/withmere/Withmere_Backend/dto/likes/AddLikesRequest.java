package com.withmere.Withmere_Backend.dto.likes;

import com.withmere.Withmere_Backend.domain.likes.Likes;
import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddLikesRequest {
    private Post post;
    private User user;

    public Likes toEntity(Post post, User user){
        return new Likes(post, user);
    }
}
