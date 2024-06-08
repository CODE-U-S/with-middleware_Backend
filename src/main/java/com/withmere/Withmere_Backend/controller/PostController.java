package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.dto.friend.AddFriendRequest;
import com.withmere.Withmere_Backend.dto.friend.FriendResponse;
import com.withmere.Withmere_Backend.service.post.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
@EnableJpaAuditing
public class PostController {
    private final PostPostService postPostService;
    private final DeletePostService deletePostService;
    private final GetPostTitleService getPostTitleService;
    private final GetPostGroundService getPostGroundService;
    private final GetPostDivisionService getPostDivisionService;
    //private final GetPostTimeService getPostTimeService;
    //private final PostUpdateService postUpdateService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody @Valid AddPostRequest request) {
        postPostService.execute(request);
    }

    @DeleteMapping
    public void deletePost(@RequestBody @Valid AddPostRequest request) {
        deletePostService.execute(request.getEmail(), request.getPostTitle());
    }
    @GetMapping("/title")
    public List<PostResponse> getPostTitle(@RequestBody @Valid AddPostRequest request) {
        return getPostTitleService.execute(request.getPostTitle());
    }

    @GetMapping("/ground")
    public List<PostResponse> getPostGround(@RequestBody @Valid AddPostRequest request){
        return getPostGroundService.execute(request.getGround());
    }

    @GetMapping("/division")
    public List<PostResponse> getPostDivision(@RequestBody @Valid AddPostRequest request){
        return getPostDivisionService.execute(request.getDivision());
    }

//    @GetMapping("/time")
//    public List<PostResponse> getPostTime(@RequestBody @Valid AddPostRequest request){
//        return getPostTimeService.execute(request.getStartDate(), request.getEndDate());
//    }
}
