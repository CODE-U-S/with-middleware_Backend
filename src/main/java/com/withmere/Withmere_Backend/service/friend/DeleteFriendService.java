package com.withmere.Withmere_Backend.service.friend;

import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.exception.FriendNotFoundException;
import com.withmere.Withmere_Backend.exception.UserNotFoundException;
import com.withmere.Withmere_Backend.repository.FriendRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteFriendService {
    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    @Transactional
    public void execute(User toUser, User fromUser) {
        if(toUser == null || !userRepository.existsById(toUser.getEmail()) || fromUser == null || !userRepository.existsById(fromUser.getEmail())) throw UserNotFoundException.EXCEPTION;
        if(!friendRepository.existsByToUserAndFromUser(toUser, fromUser)) throw FriendNotFoundException.EXCEPTION;
        friendRepository.deleteByToUserAndFromUser(toUser, fromUser);
    }
}