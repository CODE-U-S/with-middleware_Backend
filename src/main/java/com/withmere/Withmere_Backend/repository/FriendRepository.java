package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.friend.Friend;
import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Long> {
    List<Friend> findAllByToUser(User toUser);
    List<Friend> findAllByFromUser(User fromUser);
    void deleteByToUserAndFromUser(User toUser, User fromUser);
    boolean existsByToUserAndFromUser(User toUser, User fromUser);
}
