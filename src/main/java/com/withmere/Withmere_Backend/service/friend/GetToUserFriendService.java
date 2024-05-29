package com.withmere.Withmere_Backend.service.friend;

import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.friend.FriendResponse;
import com.withmere.Withmere_Backend.exception.UserNotFoundException;
import com.withmere.Withmere_Backend.repository.FriendRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GetToUserFriendService {
    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<FriendResponse> execute(User toUser) {
        if(toUser == null || !userRepository.existsById(toUser.getEmail())) throw UserNotFoundException.EXCEPTION;

        List<FriendResponse> follows = friendRepository.findAllByToUser(toUser)
                .stream()
                .map(FriendResponse::new)
                .collect(Collectors.toList());

        return follows;
    }
}
