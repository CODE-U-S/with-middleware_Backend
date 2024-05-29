package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.friend.Friend;
import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Long> {
    List<Friend> findAllByToUser(String toUser);
    List<Friend> findAllByFromUser(User fromUser);
    void deleteByToUserAndFromUser(String toUser, User fromUser);
    boolean existsByToUserAndFromUser(String toUser, User fromUser);
}
