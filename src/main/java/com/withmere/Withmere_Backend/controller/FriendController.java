package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.friend.AddFriendRequest;
import com.withmere.Withmere_Backend.dto.friend.FriendResponse;
import com.withmere.Withmere_Backend.service.friend.DeleteFriendService;
import com.withmere.Withmere_Backend.service.friend.GetFromUserFriendService;
import com.withmere.Withmere_Backend.service.friend.GetToUserFriendService;
import com.withmere.Withmere_Backend.service.friend.PostFriendService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/friend")
public class FriendController {
    private final PostFriendService postFriendService;
    private final GetToUserFriendService getToUserFriendService;
    private final GetFromUserFriendService getFromUserFriendService;
    private final DeleteFriendService deleteFriendService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addFriend(@RequestBody @Valid AddFriendRequest request) {
        postFriendService.execute(request);
    }

    @GetMapping("/to")
    public List<FriendResponse> getToUserFriend(@RequestBody @Valid AddFriendRequest request) {
        return getToUserFriendService.execute(request.getToUser());
    }

    @GetMapping("/from")
    public List<FriendResponse> getFromUserFriend(@RequestBody @Valid AddFriendRequest request) {
        return getFromUserFriendService.execute(request.getFromUser());
    }

    @DeleteMapping
    public void deleteFriend(@RequestBody @Valid AddFriendRequest request) {
        deleteFriendService.execute(request.getToUser(), request.getFromUser());
    }
}