package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.likes.AddLikesRequest;
import com.withmere.Withmere_Backend.dto.likes.LikesResponse;
import com.withmere.Withmere_Backend.service.likes.DeleteLikesService;
import com.withmere.Withmere_Backend.service.likes.GetPostLikesService;
import com.withmere.Withmere_Backend.service.likes.GetUserLikesService;
import com.withmere.Withmere_Backend.service.likes.PostLikesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/likes")
public class LikesController {
    private final PostLikesService pls;
    private final DeleteLikesService dls;
    private final GetPostLikesService gpls;
    private final GetUserLikesService guls;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addLike(@RequestBody @Valid AddLikesRequest request){
        pls.execute(request);
    }

    @DeleteMapping
    public void deleteLike(@RequestBody @Valid AddLikesRequest request){
        dls.execute(request.getPost(), request.getUser());
    }

    @GetMapping("/post")
    public List<LikesResponse> getPostLikes(@RequestBody @Valid AddLikesRequest request){
        return gpls.execute(request.getPost());
    }

    @GetMapping("/user")
    public List<LikesResponse> getUserLikes(@RequestBody @Valid AddLikesRequest request){
        return guls.execute(request.getUser());
    }
}
