package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.exception.UserNotFoundException;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public User getUser() {
        return userRepository.findById("rlagPtmd@e-mirim.hs.kr")
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
