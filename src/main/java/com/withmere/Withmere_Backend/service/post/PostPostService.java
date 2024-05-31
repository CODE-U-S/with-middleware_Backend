package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.post.AddPostRequest;
import com.withmere.Withmere_Backend.repository.FriendRepository;
import com.withmere.Withmere_Backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@RequiredArgsConstructor
@Service
public class PostPostService {
    private final PostRepository postRepository;

    @Transient
    public void execute(AddPostRequest request) {
        Post post_id = request.getPost_id();
        User email = request.getEmail();
        Post post_title = request.getPost_title();
        Post post_img = request.getPost_img();
        Post start_date = request.getStart_date(); //게시판의 모집 시작 날짜
        Post end_date = request.getEnd_date(); //게시판의 모집 마감 날짜
        Post post_description = request.getPost_description();

        postRepository.save(request.postEntity(post_id, email, post_title, post_img, start_date, end_date, post_description));
    }
}
