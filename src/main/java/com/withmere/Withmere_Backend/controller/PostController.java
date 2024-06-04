package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.dto.Post.PostResponse;
import com.withmere.Withmere_Backend.service.post.DeletePostService;
import com.withmere.Withmere_Backend.service.post.GetPostService;
import com.withmere.Withmere_Backend.service.post.PostPostService;
import com.withmere.Withmere_Backend.service.post.PostUpdateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {
    private final PostPostService postPostService;
    private final DeletePostService deletePostService;
    private final GetPostService getPostService;
    private final PostUpdateService postUpdateService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody @Valid AddPostRequest request) {
        postPostService.execute(request);
    }

    @GetMapping("/recent")
    public List<PostResponse> getPost(@RequestBody @Valid AddPostRequest request) {
        return getPostService.execute(request.getPost_title());
    }

    @DeleteMapping
    public void deletePost(@RequestBody @Valid AddPostRequest request) {
        deletePostService.execute(request.getEmail(), request.getPost_title());
    }

    @PutMapping("/{id}")
    public PostResponse updatePost(@PathVariable Long id, @RequestBody AddPostRequest postRequest) {
        return postUpdateService.updatePost(id, postRequest);
    }
}
