package com.withmere.Withmere_Backend.service.friend;

import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.dto.friend.AddFriendRequest;
import com.withmere.Withmere_Backend.repository.FriendRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostFriendService {
    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    @Transactional
    public void execute(AddFriendRequest request) {
        User toUser = request.getToUser();
        // toUser가 없을 경우
        if(!userRepository.existsById(toUser.getEmail())) throw UserNotFoundException.EXCEPTION;

        User fromUser = request.getFromUser();
        // fromUser가 없을 경우
        if(!userRepository.existsById(fromUser.getEmail())) throw UserNotFoundException.EXCEPTION;

        // 이미 친구 추가가 된 경우
        if(friendRepository.existsByToUserAndFromUser(toUser, fromUser)) throw FollowDuplicateException.EXCEPTION;

        friendRepository.save(request.toEntity(toUser, fromUser));
    }
}
