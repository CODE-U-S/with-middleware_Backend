package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.post.AddPostRequest;
import com.withmere.Withmere_Backend.service.post.PostPostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostPostService postPostService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody @Valid AddPostRequest request) {postPostService.execute(request);}
}
